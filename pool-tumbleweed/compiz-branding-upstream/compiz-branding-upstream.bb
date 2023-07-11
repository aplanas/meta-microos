SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-upstream-0.8.18-2.9.aarch64.rpm"
RPM_HASH = "37b554e16c9de749c5412b03e056bee4cbb9ac8d78505d5293b8b5ed0d9b1b06571072d61b436b3c8add89acb6dd31b919e4f8f4581f09c752faf1f783751b73"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-upstream"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
compiz"

inherit rpm
