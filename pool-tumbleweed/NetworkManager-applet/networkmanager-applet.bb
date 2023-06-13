SUMMARY = "GTK+ tray applet for use with NetworkManager"
DESCRIPTION = "This package contains utilities and applications for use with \
NetworkManager, including a panel applet for wireless networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "NetworkManager-applet-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "8c14fbecf47dc403a79ee312a01aba63906557c7d075b93678dae214b52f5c97f7eb62bad95c1d1e984003cae69c595d9d8f991a7acc2273a103898cecf1fda3"

RPROVIDES:${PN} += "NetworkManager-applet \
NetworkManager-applet(aarch-64) \
NetworkManager-client \
NetworkManager-gnome \
NetworkManager-gnome-lang \
application() \
application(nm-applet.desktop)"

RDEPENDS:${PN} += "NetworkManager \
dbus(org.freedesktop.secrets) \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libappindicator3.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmm-glib.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_12_0)(64bit) \
libnm.so.0(libnm_1_16_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnm.so.0(libnm_1_4_0)(64bit) \
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_2_0)(64bit) \
libnma.so.0(libnma_1_8_20)(64bit) \
libnma.so.0(libnma_1_8_22)(64bit) \
libnma.so.0(libnma_1_8_28)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
mobile-broadband-provider-info \
timezone"

inherit rpm
