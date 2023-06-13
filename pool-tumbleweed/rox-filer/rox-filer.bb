SUMMARY = "Minimalist file manager"
DESCRIPTION = "ROX-Filer is a fast and powerful graphical file manager for the X Window System. \
You can use it as a small and fast filer within your current desktop, or get it \
to manage your pinboard, panels and applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "rox-filer-2.11-8.13.aarch64.rpm"
RPM_HASH = "953817a224f0de91d9a0617171f9108e27ff072271d4dace4b0eb4fa5ac967f44e322422745353087b407053782c38f20b6c80ad83414a939b11cfb6360cb57c"

RPROVIDES:${PN} += "rox-filer \
rox-filer(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
shared-mime-info"

inherit rpm
