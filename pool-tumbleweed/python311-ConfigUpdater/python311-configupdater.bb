SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python311-ConfigUpdater-3.1.1-1.4.noarch.rpm"
RPM_HASH = "8157c0a7d10bcdc9c193121389649463682c71a2ab9259b8abc8e5555117e36c151143f73525aff48a26738a294e16411007d34865e6b47b982f8d1b4b0d6d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-configupdater \
python311-ConfigUpdater \
python311-configupdater \
python3dist-configupdater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
