SUMMARY = "Weathershow applet"
DESCRIPTION = "WeatherShowII is a completely rewritten version of the existing python WeatherShow applet."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-weathershow-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "0be2879aeb905e9ee0ce62cad76fae82e13f64d3f749242431ec49a0d7e6eb73c337650a0591338a5987fad6263ec3ed0a92a7ba142922922691081bbeb8764b"

RPROVIDES:${PN} += "budgie-weathershow-applet \
libweathershow.so"

RDEPENDS:${PN} += "budgie-extras-lang \
dconf \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpeas-1.0.so.0 \
libsoup-2.4.so.1 \
procps"

inherit rpm
