SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "python39-xapp-2.2.1-1.18.noarch.rpm"
RPM_HASH = "afc504218c8ad4ea377d4799c128cc6aa387b8f6888f4cc95fe5d0dbd86cfc393d4697f9c5a94dc257d9d88e78a540701f60fc1d04088e754e8c47fd2305a947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-xapp \
python39-xapp \
python3dist-python-xapp"

RDEPENDS:${PN} += "python-abi \
python39-psutil \
xdg-utils"

inherit rpm
