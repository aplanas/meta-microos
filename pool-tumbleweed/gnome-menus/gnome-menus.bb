SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-menus-3.36.0-3.4.aarch64.rpm"
RPM_HASH = "6f027e3ccaa2ceeceb2d2f0e84139bd7fbd0aa234d9293ca87dcc8fff4e3d302acc1c8dbcd458f6ceb14fe880ff76688e38ca0ef3fbc19c234302a188f630f94"

RPROVIDES:${PN} += "gnome-menus"

RDEPENDS:${PN} += "gnome-menus-branding"

inherit rpm
