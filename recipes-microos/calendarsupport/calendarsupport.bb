SUMMARY = "KDE PIM calendaring support library"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "calendarsupport-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6dc8882119c692ed8fa2dff65b0c091dcbe47fdd7fdf3c329980dc29d57a05db282a6d0ccca9e70e9cccba2be339431b90ced9a14eeac70d608716a47d54251f"

RPROVIDES:${PN} += "calendarsupport calendarsupport(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
