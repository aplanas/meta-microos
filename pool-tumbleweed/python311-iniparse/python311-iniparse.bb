SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-iniparse-0.5-5.1.noarch.rpm"
RPM_HASH = "6b814e975338fc4df0c6a65fbf9d67272f768258ff113f1f65f67d3a5498f83461527c8d140fafe53ab987998d230a6f0f718769947ddf1dc37b4bffd2f6ccf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iniparse \
python3.11dist-iniparse \
python311-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
