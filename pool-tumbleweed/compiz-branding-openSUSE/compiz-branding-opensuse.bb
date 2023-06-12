SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-openSUSE-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "ca154e97f18fed49a56264b7c24d32b8029dc9cf8ad20c104edff4cb856f4ca16c0cccfb8c414d49a5b0a37d39f25f135127760572edfcc3a268a58b2f025599"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-openSUSE \
compiz-branding-openSUSE(aarch-64)"
RDEPENDS:${PN} += "/bin/ln \
/bin/rm \
/bin/sh \
compiz"

inherit rpm
