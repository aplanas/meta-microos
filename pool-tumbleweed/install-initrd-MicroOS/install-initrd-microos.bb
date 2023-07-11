SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-MicroOS-17.89-1.31.aarch64.rpm"
RPM_HASH = "ee7565f3dbcfc1afca081784b881b51fc19e9b1ae3d6d7f5f120b1344aa0355fe18d78a2714e20a43be200e55d82ed0d641810bf79328b5b2f28dff2d8a1d596"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
