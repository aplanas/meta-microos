SUMMARY = "A file manager for the GNOME desktop environment"
DESCRIPTION = "GNOME Commander is a 'two-pane' graphical file manager for the Linux \
desktop using GNOME libraries. In addition to basic file manager \
functions, the program is also an FTP client and can browse SMB \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.0"

RPM_NAME = "gnome-commander-1.16.0-2.3.aarch64.rpm"
RPM_HASH = "b99b56d666d218aa406644416b5900a453969c069fc62d135246de51829e3d94727c16c2201338abb1ba4812912d961cc2f6079617c83c7c137f2328990aafad"

RPROVIDES:${PN} += "application() \
application(org.gnome.gnome-commander.desktop) \
gnome-commander \
gnome-commander(aarch-64) \
gnome-commander-doc \
libfilerollerplugin.so()(64bit) \
libtestplugin.so()(64bit) \
metainfo() \
metainfo(org.gnome.gnome-commander.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsf-1.so.114()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpoppler-glib.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtag.so.1()(64bit)"

inherit rpm
