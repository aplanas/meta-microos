SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-openSUSE-17.89-1.47.aarch64.rpm"
RPM_HASH = "771d2861d51d80dce1531c8555a8078ed38668473dddb65dc5bf2d62c66bf23296109b6d56b813df1784b03ef69f49e581e3ed11ffe4c73027081b4719e84931"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
