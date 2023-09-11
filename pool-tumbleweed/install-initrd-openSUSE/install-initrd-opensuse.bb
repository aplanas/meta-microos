SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-openSUSE-17.91-1.90.aarch64.rpm"
RPM_HASH = "c2a43bc6f816ce12e82f774fbae8839148e9b2097decd1c4b0c1be09e52b795e6d86b15af1d9a5e4aa760a211b5fc0974d4d1450c03aa60ff5df95ab2550d4cd"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
