SUMMARY = "GNOME Keyboard Library"
DESCRIPTION = "GNOME keyboard shared library. \
 \
This package provides the shared library of libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd8-3.28.1-1.3.aarch64.rpm"
RPM_HASH = "68d1fe0f2c8d2fdffcd9f477d22b9544e029669d4cab14a469607eef6218df3593682c534c59a310ff56a0a53d86e5b87ebf9575d33c29879bd9ef6da8882afc"

RPROVIDES:${PN} += "libgnomekbd \
libgnomekbd.so.8 \
libgnomekbd8 \
libgnomekbdui.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxklavier.so.16"

inherit rpm
