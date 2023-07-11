SUMMARY = "Development files for libinsane-gobject"
DESCRIPTION = "Development libraries and header files for libinsane-gobject. \
It also includes the vala bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane_gobject-devel-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "a8975531c5cb9f01e1c26432e03fb85c6d8ab6712ce54bc94eaaf20ceff577eca8f9db7aa76f38b73e321d8fa82cf857b04275930a1fef3f127ae3b14bee24ed"

RPROVIDES:${PN} += "libinsane-gobject-devel"

RDEPENDS:${PN} += "libinsane-devel \
libinsane-gobject1 \
typelib-1-0-Libinsane-1-0"

inherit rpm
