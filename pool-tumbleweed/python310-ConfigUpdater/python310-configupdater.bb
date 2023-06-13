SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python310-ConfigUpdater-3.1.1-1.4.noarch.rpm"
RPM_HASH = "3faf09c6093882e0ae8bb14c4f2b2c8cb87bb5a06fad3039ecb3d3f0889fa2f8a7fcc4bc52d2e6277695a71d50e7251b90673504430b2161cd582587e79620fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ConfigUpdater \
python3-configupdater \
python3.10dist(configupdater) \
python310-ConfigUpdater \
python310-configupdater \
python3dist(configupdater)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
