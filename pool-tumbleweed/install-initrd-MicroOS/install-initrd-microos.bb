SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-MicroOS-17.91-1.88.aarch64.rpm"
RPM_HASH = "b8e70b48946322607e6fb456fa8403a00e001073082dbed16829167ae2f8d2e6489ac5ca18a2829a8f94c3e7b59ce92848c5bf67a4824924f0daf60988138cb3"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
