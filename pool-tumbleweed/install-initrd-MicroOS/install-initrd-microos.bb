SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-MicroOS-17.91-1.83.aarch64.rpm"
RPM_HASH = "c0ea987acbe54375bb89bdcfd82b4aa0c030566c13bb1f1c7722c60c77490edbba55d5983526ba2cd025daae8df4540efa20c84a353ec5514019663e36950eea"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
