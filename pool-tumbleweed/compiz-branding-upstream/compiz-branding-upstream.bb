SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-upstream-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "f22cda9e97c5a18f3c8c05ba12b35a81115b68ef5294f7db3ae2c35a2e6c8515e28fe46b3f93e9eee7022d437229e41040f5efef829f46ec6a207db7b140b480"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-upstream"

RDEPENDS:${PN} += "/bin/ln \
/bin/rm \
/bin/sh \
compiz"

inherit rpm
