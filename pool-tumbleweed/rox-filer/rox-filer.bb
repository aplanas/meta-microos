SUMMARY = "Minimalist file manager"
DESCRIPTION = "ROX-Filer is a fast and powerful graphical file manager for the X Window System. \
You can use it as a small and fast filer within your current desktop, or get it \
to manage your pinboard, panels and applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "rox-filer-2.11-8.13.aarch64.rpm"
RPM_HASH = "953817a224f0de91d9a0617171f9108e27ff072271d4dace4b0eb4fa5ac967f44e322422745353087b407053782c38f20b6c80ad83414a939b11cfb6360cb57c"

RPROVIDES:${PN} += "rox-filer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libxml2.so.2 \
shared-mime-info"

inherit rpm
