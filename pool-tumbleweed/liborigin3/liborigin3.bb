SUMMARY = "A library for reading OriginLab OPJ project files"
DESCRIPTION = "A library for reading OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin3-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "474bf7aec2bdb0f58caedaa5bba764d1f6db8743931d8b91cdc44a7eb71b597e5588ed55c1e1e4d04a37e7c3505f29be590ea85a26741141ce578f5d1229c349"

RPROVIDES:${PN} += "liborigin.so.3()(64bit) \
liborigin3 \
liborigin3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
