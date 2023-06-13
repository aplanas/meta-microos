SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_ribbon-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "95c0ea5fa2703659db9310544c63bd6cfd5243f94e864bfe24060d5c337e055c4ddd027b9dc007bf3abdc87ee4c041778f1e934a66271158b203dc7a216e580b"

RPROVIDES:${PN} += "libwx_gtk2u_ribbon-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_ribbon-suse-nostl3_0_5 \
libwx_gtk2u_ribbon-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
