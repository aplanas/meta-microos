SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "python39-xapp-2.2.1-1.16.noarch.rpm"
RPM_HASH = "5297a9ec0862a65128a0842b65c004838ab9b44812395efdf660ac1c5d78534c25ad3c9947efb9c64210e080ac6d2cb021e5c0d1924032642c04087a07967c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-xapp \
python39-xapp \
python3dist-python-xapp"

RDEPENDS:${PN} += "python-abi \
python39-psutil \
xdg-utils"

inherit rpm
