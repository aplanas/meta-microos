SUMMARY = "Signed Distance Fields viewer"
DESCRIPTION = "Signed Distance Fields viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftsdf-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "9347d1ac26e187cf76618b831cb4f215b85bb1af05558aea7aba57c548b78beef83fc871e54fa0abf5e70c4b8d26229ae2084278788813d62ec8bcda9ece16a8"

RPROVIDES:${PN} += "ftsdf ftsdf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libgobject-2.0.so.0()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
