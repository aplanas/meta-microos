SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python39-ConfigUpdater-3.1.1-1.4.noarch.rpm"
RPM_HASH = "cf10c6540870fa88d33400ed8518f0be5c798893a4dc4de5e1f450a50fd6a84f09501875fed1fafe68f58d2abf2456e38adac721760970f65debac411ef16a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-configupdater \
python39-ConfigUpdater \
python39-configupdater \
python3dist-configupdater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
