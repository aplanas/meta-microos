SUMMARY = "Weathershow applet"
DESCRIPTION = "WeatherShowII is a completely rewritten version of the existing python WeatherShow applet."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-weathershow-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "2935487e06f883bf1f0d3b808c28bf82ae3d6675ce10e5d9d98f2f1a1464a889317079ad4eb21e231a858deb86e371f07f48c51fea8e7cc234d337bb195c7b51"

RPROVIDES:${PN} += "budgie-weathershow-applet budgie-weathershow-applet(aarch-64) libweathershow.so()(64bit)"
RDEPENDS:${PN} += "budgie-extras-lang dconf ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbudgie-plugin.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpeas-1.0.so.0()(64bit) libsoup-2.4.so.1()(64bit) procps"

inherit rpm
