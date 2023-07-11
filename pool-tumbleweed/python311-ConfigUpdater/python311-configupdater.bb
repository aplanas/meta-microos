SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python311-ConfigUpdater-3.1.1-1.6.noarch.rpm"
RPM_HASH = "fe5cac2fd529bde54c64ccd9dc9705886c364eb2a37d47ab73f0ad5baa8500a4964e57ba3d5e5ec111fd09b382846e3f5210a70d50e445e666f9376fdd75c7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ConfigUpdater \
python3-configupdater \
python3.11dist-configupdater \
python311-ConfigUpdater \
python311-configupdater \
python3dist-configupdater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
