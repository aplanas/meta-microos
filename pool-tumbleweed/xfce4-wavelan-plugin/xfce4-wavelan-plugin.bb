SUMMARY = "WLAN Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The WaveLAN plugin can monitor a wireless LAN interface and display signal \
state, quality and the network name (SSID)."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "xfce4-wavelan-plugin-0.6.3-1.4.aarch64.rpm"
RPM_HASH = "6870eb3105944164c848485c9049223af2f74fa34b59678f18defd597b830f857ba12205a328123e8c0414d7b9ac5100c4a57bae8607fc486a8b96414b62e659"

RPROVIDES:${PN} += "libwavelan.so \
xfce4-panel-plugin-wavelan \
xfce4-wavelan-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
