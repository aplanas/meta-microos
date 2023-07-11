SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "python310-xapp-2.2.1-1.18.noarch.rpm"
RPM_HASH = "aae70b16393895d1eb53b70365fb1b1a0dd68a78bda6a3954aceb32d8c027e4100a8dcfc5888b54224ec396ca82ae1b82f849c62557c127e59e8b7453e281f73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-xapp \
python310-xapp \
python3dist-python-xapp"

RDEPENDS:${PN} += "python-abi \
python310-psutil \
xdg-utils"

inherit rpm
