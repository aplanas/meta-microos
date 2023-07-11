SUMMARY = "Development files for libinsane"
DESCRIPTION = "Development libraries and header files for libinsane."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane-devel-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "d7f9627cacda3c2511a0ced9ca5c23f2795a3b4c08a8a56ad4eff026e1a57494111e6a0302107643fbace775bc662ccb557cb2999fb04175253e033d3f392ab0"

RPROVIDES:${PN} += "libinsane-devel \
pkgconfig-libinsane"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinsane1 \
pkgconfig-sane-backends \
typelib-1-0-Libinsane-1-0"

inherit rpm
