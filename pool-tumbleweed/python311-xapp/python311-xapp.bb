SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "python311-xapp-2.2.1-1.18.noarch.rpm"
RPM_HASH = "ff3b59719baea2fdeb6c9f603f663bd8673c6af5fad24e05f4e9585d12c830c1beba7fe24f5104b3005bdd3594000b87061d6fe91950ee8a49ca9e16e6a1b4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xapp \
python3.11dist-python-xapp \
python311-xapp \
python3dist-python-xapp"

RDEPENDS:${PN} += "python-abi \
python311-psutil \
xdg-utils"

inherit rpm
