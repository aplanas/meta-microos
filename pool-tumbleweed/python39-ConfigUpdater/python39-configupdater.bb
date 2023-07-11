SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python39-ConfigUpdater-3.1.1-1.6.noarch.rpm"
RPM_HASH = "88e4d6457e484f9991b4bd29e920d5686fb374375938731b242518df88b0e91f48986eccb4c099bf05562b3856cf452e4acb03bcc85f6b4a743c73bc3374c709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-configupdater \
python39-ConfigUpdater \
python39-configupdater \
python3dist-configupdater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
