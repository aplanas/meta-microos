SUMMARY = "Gtk3 client for freeciv"
DESCRIPTION = "Freeciv executable using Gtk3 library"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "freeciv-gtk3-3.0.7-1.1.aarch64.rpm"
RPM_HASH = "c50787fa6340cf2c1a49690181254f9b8a1fe1a6fb62584c88f1c995ce14fa159a71f543f36f54a3757887f8d9663ab2fb45a621caf2f92c789fe58c9ef38584"

RPROVIDES:${PN} += "application() application(org.freeciv.gtk3.desktop) application(org.freeciv.mp.gtk3.desktop) freeciv-gtk3 freeciv-gtk3(aarch-64) freeciv_client-3.0.7 metainfo() metainfo(org.freeciv.gtk3.appdata.xml) metainfo(org.freeciv.mp.gtk3.appdata.xml)"
RDEPENDS:${PN} += "freeciv ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libicuuc.so.72()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
