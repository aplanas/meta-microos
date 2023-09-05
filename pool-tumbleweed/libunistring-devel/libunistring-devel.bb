SUMMARY = "Development files for the GNU Unicode string library"
DESCRIPTION = "Development files for programs using libunistring and documentation \
for UniString library."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "libunistring-devel-1.1-3.1.aarch64.rpm"
RPM_HASH = "e2e03fdd2046f7cf7f1344d3bf5847575c3175d6ea68b3076f7f9f19881daa88c5d1bc04cab01d93c3a7b91089733c0e49a49939833c83315df7573bd4be4b2c"

RPROVIDES:${PN} += "libunistring-devel"

RDEPENDS:${PN} += "libunistring5"

inherit rpm
