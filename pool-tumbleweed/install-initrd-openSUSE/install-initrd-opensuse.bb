SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "install-initrd-openSUSE-17.87-1.8.aarch64.rpm"
RPM_HASH = "e99d695eef93a5a1379f71bbaad1e5035c300e5af8fdaa4b87921ee0f63220ac4a898e94a82dd2a28ac0622769e115a2eec601555c84adfbc50d6a173dc968fb"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE \
install-initrd-openSUSE(aarch-64)"

RDEPENDS:${PN} += "/bin/ln \
/bin/sh"

inherit rpm
