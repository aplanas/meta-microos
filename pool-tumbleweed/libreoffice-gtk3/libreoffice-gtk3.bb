SUMMARY = "Gtk3 interface for LibreOffice"
DESCRIPTION = "This package contains Gtk3 interface rendering option for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-gtk3-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "05b9ce29c14573e849764022a1c47ba7c480d7b03162674cb9256707219fd28e51f3450db15967bcc0668f2a11cb9fca8cc85022510761d1f80a61421c7ca5ec"

RPROVIDES:${PN} += "libreoffice-gtk3 \
libreoffice-gtk3(aarch-64) \
libvclplug_gtk3lo.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libi18nlangtag.so()(64bit) \
libjvmaccesslo.so()(64bit) \
libm.so.6()(64bit) \
libmergedlo.so()(64bit) \
libpango-1.0.so.0()(64bit) \
libreoffice-gnome \
libstdc++.so.6()(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
rtld(GNU_HASH)"

inherit rpm
