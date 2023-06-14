SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-iniparse-0.5-4.3.noarch.rpm"
RPM_HASH = "84f37b14b4cb42472a9af7c8d74499399f9471d39a9a6f70e67ad7a6097bad94a99cd42c1790a3eaa89e3f5ac2e96246f6e7eccfb9ac68612a39956050ccb0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iniparse \
python3.10dist-iniparse \
python310-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
