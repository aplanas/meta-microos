SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-iniparse-0.5-4.5.noarch.rpm"
RPM_HASH = "fc4b8c70b652593d82863261f2ba4eff9503b302142a6eb6c603903fa20ef86eb5a8f72f29da6c4f7961199417fed91073977ff0f5000d66c7d7a2b12685b86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iniparse \
python3.11dist-iniparse \
python311-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
