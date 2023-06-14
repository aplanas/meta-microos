SUMMARY = "Development files for libinsane-gobject"
DESCRIPTION = "Development libraries and header files for libinsane-gobject. \
It also includes the vala bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.9"

RPM_NAME = "libinsane_gobject-devel-1.0.9-1.9.aarch64.rpm"
RPM_HASH = "863c95da2c9683c6dd591c1f18b9f7eca0587845c7734ad8c4208e604c4a32de444d53441f86f1c324f6577378a1af7f4a5bdc0d962f72484811cce2a3e98249"

RPROVIDES:${PN} += "libinsane-gobject-devel"

RDEPENDS:${PN} += "libinsane-devel \
libinsane-gobject1 \
typelib-1-0-Libinsane-1-0"

inherit rpm
