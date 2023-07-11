SUMMARY = "KDE PIM calendaring support library"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "calendarsupport-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9965d824945220188bd357f8c7eadca403c2831992180f8e45dbfbc30c5c808b3d76da717b72afd19c62b7aa603070364eda28671c41f8b26c201482c735a1ef"

RPROVIDES:${PN} += "calendarsupport"

RDEPENDS:${PN} += ""

inherit rpm
