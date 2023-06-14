SUMMARY = "GTK+ tray applet for use with NetworkManager"
DESCRIPTION = "This package contains utilities and applications for use with \
NetworkManager, including a panel applet for wireless networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "NetworkManager-applet-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "8c14fbecf47dc403a79ee312a01aba63906557c7d075b93678dae214b52f5c97f7eb62bad95c1d1e984003cae69c595d9d8f991a7acc2273a103898cecf1fda3"

RPROVIDES:${PN} += "NetworkManager-applet \
NetworkManager-client \
NetworkManager-gnome \
NetworkManager-gnome-lang"

RDEPENDS:${PN} += "NetworkManager \
dbus-org.freedesktop.secrets \
iso-codes \
ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmm-glib.so.0 \
libnm.so.0 \
libnma.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0 \
mobile-broadband-provider-info \
timezone"

inherit rpm
