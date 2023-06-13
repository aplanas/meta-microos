SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "2fa7c663ad113ca6a37b2e7e64de577689d276856aebe73e1d6bd769acf3908dfe72bcd46b3f644ab422ef47b13ba4bead581046fc265e7a095db9028af48857"

RPROVIDES:${PN} += "libwx_gtk2u_propgrid-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_propgrid-suse-nostl3_0_5 \
libwx_gtk2u_propgrid-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
