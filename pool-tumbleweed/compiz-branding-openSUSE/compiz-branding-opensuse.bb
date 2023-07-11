SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-openSUSE-0.8.18-2.9.aarch64.rpm"
RPM_HASH = "3f20a82bedbf7c8f6eb7762ad05d2a7d9bbf3a0eac730818eb1745e15ad0843ab4bd23554872bce835db9b5307e72dd734293e255acb605e9bbb866408577150"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
compiz"

inherit rpm
