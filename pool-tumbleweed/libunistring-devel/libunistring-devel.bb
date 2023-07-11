SUMMARY = "Development files for the GNU Unicode string library"
DESCRIPTION = "Development files for programs using libunistring and documentation \
for UniString library."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "libunistring-devel-1.1-2.2.aarch64.rpm"
RPM_HASH = "a9971b13436aa679bb713f376246dab262c6b0ea2578ba7aed666d1c3294a5db51411e977e34cec64bcd91031fdd5c3ae4527493fbfdaf0016f16c741b1149fa"

RPROVIDES:${PN} += "libunistring-devel"

RDEPENDS:${PN} += "libunistring5"

inherit rpm
