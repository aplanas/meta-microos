SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_html-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "f6e872c507479dbe258966b553d57355dc8e3839a1fe6214fbd182d6f7ab4371e927de5300275254cbaaf00d8fe398fa01c944f5866df64bfd6cd07a928de766"

RPROVIDES:${PN} += "libwx_gtk2u_html-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_html-suse-nostl3_0_5 \
libwx_gtk2u_html-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmspack.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
