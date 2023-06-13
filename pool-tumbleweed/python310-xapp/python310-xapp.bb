SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "python310-xapp-2.2.1-1.16.noarch.rpm"
RPM_HASH = "551770c6186dd86ccd1f774a397395b15a4dc431d1c88c25bdba125adb8a80e45c6a5e74358da79672191a61797d047616befc1b728f59e81350c53199ece839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xapp \
python3.10dist(python-xapp) \
python310-xapp \
python3dist(python-xapp)"

RDEPENDS:${PN} += "python(abi) \
python310-psutil \
xdg-utils"

inherit rpm
