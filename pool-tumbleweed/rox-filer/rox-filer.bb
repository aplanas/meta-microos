SUMMARY = "Minimalist file manager"
DESCRIPTION = "ROX-Filer is a fast and powerful graphical file manager for the X Window System. \
You can use it as a small and fast filer within your current desktop, or get it \
to manage your pinboard, panels and applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "rox-filer-2.11-8.14.aarch64.rpm"
RPM_HASH = "b328ba95ff360bed12ab1463ef6a01a189eb01f54a30d76b21e3546a6d107dfbf476c244f695165e479b82baae6d23381faebe5496f61ac5b5d1d50c09e16cfd"

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
