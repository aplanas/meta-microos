SUMMARY = "Development files for utempter"
DESCRIPTION = "Utempter is a privileged helper for utmp and wtmp updates.  This \
package contains the development files needed."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "utempter-devel-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "cd7ea94f8ea4b361bc80736ad5d93a72706e4e9d6f58259fcd09106ecc2e3f15cd1c8176567ba1583c8519ef8580f34dbc1b9ed1b9af6370db3741d7b91f3598"

RPROVIDES:${PN} += "utempter-devel"

RDEPENDS:${PN} += "libutempter0"

inherit rpm
