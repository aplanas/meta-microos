SUMMARY = "Perl interface to the cairo 2d vector graphics library"
DESCRIPTION = "Perl interface to the cairo 2d vector graphics library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.109"

RPM_NAME = "perl-Cairo-1.109-1.13.aarch64.rpm"
RPM_HASH = "aed3856e3d3fc23bc7e2b335d47f28ba7fdab719d6a5c065e8a14ee06ec74b8782f7f31f12fa64baf64e206ca4014b8846caca79810f1a86a4e203c3804cb76f"

RPROVIDES:${PN} += "perl(Cairo) \
perl(Cairo::Install::Files) \
perl-Cairo \
perl-Cairo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(ExtUtils::Depends) \
perl(ExtUtils::PkgConfig)"

inherit rpm
