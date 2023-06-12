SUMMARY = "KDE PIM calendaring support library"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "calendarsupport-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fe490eb84143d87f4926124a05b868cab716345fd8ebd20c08d0c490fc1cab23b63444898cd20fba0ec29ca5a5e263a50b4eccb62d54b454cac8e687fa46a437"

RPROVIDES:${PN} += "calendarsupport \
calendarsupport(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
