SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_ribbon-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "ec8ce39ab38017701b679b4e288a2313aad991dbb34cd652c5c39bb2dd2f61d69af72f6142bebf4a79c409e5f4e95d132d71e0fc6cf5bb2fe95eefe25c6063b3"

RPROVIDES:${PN} += "libwx-gtk2u-ribbon-suse-nostl.so.3.0.5 \
libwx-gtk2u-ribbon-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
