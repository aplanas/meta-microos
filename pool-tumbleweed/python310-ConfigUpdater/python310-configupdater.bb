SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python310-ConfigUpdater-3.1.1-1.6.noarch.rpm"
RPM_HASH = "19c46c6ad8e4dc871774c5feec974eda19f3019a7e1e84cfc2bb7db8a950993ace755779b44b812d34512fcb7a47e9fd48ab35894128826f7ce18720808a8721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-configupdater \
python310-ConfigUpdater \
python310-configupdater \
python3dist-configupdater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
