SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-SLED-0.8.18-2.9.aarch64.rpm"
RPM_HASH = "5c2031082d49152f8196fbf1559b3ecd02a1ba28124f07536daea6299ed7da003fcdd2f66a16421d77600f4b688512de9f8d316461c1366033f64f860abb420b"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-SLE \
compiz-branding-SLED"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
compiz"

inherit rpm
