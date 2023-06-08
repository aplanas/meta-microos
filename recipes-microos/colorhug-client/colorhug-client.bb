SUMMARY = "Tools for the Hughski Colorimeter"
DESCRIPTION = "The Hughski ColorHug colorimeter is a low cost open-source hardware \
sensor used to calibrate screens. \
 \
This package includes the client tools which allows the user to upgrade \
the firmware on the sensor or to access the sensor from command line \
scripts."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "colorhug-client-0.2.8-1.26.aarch64.rpm"
RPM_HASH = "8118e7dcbb8df7d1f35e4e876bfdce5e0a4eef387d2289dd15cf2c0a8b7bc56f62053279cbddfae8f134cfa469b713e2a10b2cbaedfa17ba0def8b11091bd7a4"

RPROVIDES:${PN} += "application() application(com.hughski.ColorHug.Backlight.desktop) application(com.hughski.ColorHug.CcmxLoader.desktop) application(com.hughski.ColorHug.DisplayAnalysis.desktop) application(com.hughski.ColorHug.FlashLoader.desktop) colorhug-client colorhug-client(aarch-64) metainfo() metainfo(com.hughski.ColorHug.Backlight.appdata.xml) metainfo(com.hughski.ColorHug.CcmxLoader.appdata.xml) metainfo(com.hughski.ColorHug.DisplayAnalysis.appdata.xml) metainfo(com.hughski.ColorHug.FlashLoader.appdata.xml) mimehandler(application/x-ccmx)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libcolord-gtk.so.1()(64bit) libcolord.so.2()(64bit) libcolorhug.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgusb.so.2()(64bit) libgusb.so.2(LIBGUSB_0.1.0)(64bit) libgusb.so.2(LIBGUSB_0.1.1)(64bit) libgusb.so.2(LIBGUSB_0.2.2)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libsoup-2.4.so.1()(64bit)"

inherit rpm
