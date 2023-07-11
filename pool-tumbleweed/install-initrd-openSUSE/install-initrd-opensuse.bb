SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-openSUSE-17.89-1.31.aarch64.rpm"
RPM_HASH = "9a6a59c7ff0e2361d4f79dd8542a0cbb4d8689d79d44aa59cd2b1cf67dff23c70db743c45a9cbc492c257870e6d9701c488bc1a88eb636694a95e97dd03896da"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
