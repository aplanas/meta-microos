SUMMARY = "KDE PIM calendaring support library"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "calendarsupport-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fcfa55d3f79a08bf8b3d58ab746d2b3f7bc720bcb72836d4497e2fc1af3476e54e7a6f23e29a7b13ae794c9949040db4dda2f6e9917ae1678cf41031c1c8ac35"

RPROVIDES:${PN} += "calendarsupport"

RDEPENDS:${PN} += ""

inherit rpm
