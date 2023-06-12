SUMMARY = "Set of helpers for easy testing of Django apps"
DESCRIPTION = "Set of helpers for easy testing of Django apps."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-djet-0.3.0-2.3.noarch.rpm"
RPM_HASH = "939a217308c15be5f5482dde6508d0ed8bfe832ca895f781ddf370f9877237506c4c4ca03feff8ccda3748ed79ed0d03565ae32cada022d35236a9b1e85760f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(djet) \
python311-djet \
python3dist(djet)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-Pillow \
python311-six"

inherit rpm
