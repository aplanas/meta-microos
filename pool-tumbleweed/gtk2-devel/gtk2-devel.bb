SUMMARY = "Development files for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the development files for GTK+ 2.x."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-devel-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "c879bbe00dc58d6050eae1b99e230a328cabb36b0afceff4e335de79e81b778a573a87801a20f879693f5a2e9a150e46d52825c6ba38709c8da8a7a0e11a2191"

RPROVIDES:${PN} += "gail-devel \
gtk2-devel \
gtk2-devel(aarch-64) \
gtk2-doc \
libferret.so()(64bit) \
pkgconfig(gail) \
pkgconfig(gdk-2.0) \
pkgconfig(gdk-x11-2.0) \
pkgconfig(gtk+-2.0) \
pkgconfig(gtk+-unix-print-2.0) \
pkgconfig(gtk+-x11-2.0) \
rpm_macro(gtk2_immodule_post) \
rpm_macro(gtk2_immodule_postun) \
rpm_macro(gtk2_immodule_requires)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-2_0-0 \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
pkgconfig(atk) \
pkgconfig(cairo) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gdk-x11-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(gtk+-2.0) \
pkgconfig(gtk+-x11-2.0) \
pkgconfig(pango) \
pkgconfig(pangocairo) \
pkgconfig(pangoft2) \
python3-xml \
typelib-1_0-Gtk-2_0"

inherit rpm
