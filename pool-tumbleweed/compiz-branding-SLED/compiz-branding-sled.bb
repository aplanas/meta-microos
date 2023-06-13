SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-SLED-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "9fe0d5be9b1cbc02b44c4a5501ad6eabcc581493b08e7bc7b0b835056970cf5fdb07b3fede4dc27eb2220d94bd318662740c92efd36bf0af39dc49da15aeb752"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-SLE \
compiz-branding-SLED \
compiz-branding-SLED(aarch-64)"

RDEPENDS:${PN} += "/bin/ln \
/bin/rm \
/bin/sh \
compiz"

inherit rpm
