SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-iniparse-0.5-5.1.noarch.rpm"
RPM_HASH = "19e30e8e86b2457e582ff7197ee066dfae2fd7aceb6c5e4b8efe161ad579b526dcb1e207b3e04a957235c4f941bf01ca75f22a568cec82eaff2eb217a9c3e412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-iniparse \
python39-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
