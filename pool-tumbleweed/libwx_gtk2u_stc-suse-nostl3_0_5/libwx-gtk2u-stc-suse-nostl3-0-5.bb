SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_stc-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "2eae2685797bf721a653b7b4adf78ba20b1c45cf70f3bc1f78cc4ce953b64e5db764e384bae840d220872c093dcd182e2f154c393f78d04400333d8da58514ad"

RPROVIDES:${PN} += "libwx_gtk2u_stc-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_stc-suse-nostl3_0_5 \
libwx_gtk2u_stc-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
