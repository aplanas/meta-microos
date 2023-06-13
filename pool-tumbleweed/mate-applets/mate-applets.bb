SUMMARY = "A set of applets for the MATE Desktop"
DESCRIPTION = "This package provides a set of applets to use with the MATE panel."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-applets-1.26.1-1.4.aarch64.rpm"
RPM_HASH = "adb7bee1a7255a343abbbd0b593f62b2e8f5e52597ddafe58ceadd0564286e1e4e879de55b678b406d4ba94442a7c6086ad8787d70d72b080c0134f2da8b1551"

RPROVIDES:${PN} += "config(mate-applets) \
mate-applet-netspeed \
mate-applets \
mate-applets(aarch-64) \
mate-netspeed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtop-2.0.so.11()(64bit) \
libgucharmap_2_90.so.7()(64bit) \
libm.so.6()(64bit) \
libmate-panel-applet-4.so.1()(64bit) \
libmateweather.so.1()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libupower-glib.so.3()(64bit) \
libwnck-3.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
