SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_stc-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "b0aa2de6fca213fc3d98256a72c8c254028ea80f56aab184db75b009d95633e15baed2d28730f468d762a61d899b2621d31ab6f38d397397ad7a0df3162d04de"

RPROVIDES:${PN} += "libwx-gtk2u-stc-suse-nostl.so.3.0.5 \
libwx-gtk2u-stc-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
