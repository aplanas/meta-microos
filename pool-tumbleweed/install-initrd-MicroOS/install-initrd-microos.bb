SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "install-initrd-MicroOS-17.87-1.9.aarch64.rpm"
RPM_HASH = "b715dcdbbbd74e0ad1289722266269e7d0415c8f2d52b35a0413d8daf91ab1aee95f72b74c170ea448ad9cffc775ff2efe7e15ac571c0f453ab54fe2725d9396"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS \
install-initrd-MicroOS(aarch-64)"

RDEPENDS:${PN} += "/bin/ln \
/bin/sh"

inherit rpm
