SUMMARY = "Weather Condition Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Weather plugin shows short- and long-term weather forecasts."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.1"

RPM_NAME = "xfce4-weather-plugin-0.11.1-1.1.aarch64.rpm"
RPM_HASH = "8c1673e1d27198ecb5c2018080df3ca84a69c81e976df3076c2d6fa84f94c198c382aeb8698191f562e7a4cb78479335fdd24985464dcaa590409febc514f716"

RPROVIDES:${PN} += "libweather.so \
xfce4-panel-plugin-weather \
xfce4-weather-plugin"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsoup-2.4.so.1 \
libupower-glib.so.3 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxml2.so.2 \
xfce4-panel"

inherit rpm
