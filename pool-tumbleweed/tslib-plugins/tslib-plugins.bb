SUMMARY = "Driver plugins for tslib, an abstraction layer for touchscreens"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed. \
 \
This subpackage contains the hardware driver plugins for tslib."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "tslib-plugins-1.22-1.9.aarch64.rpm"
RPM_HASH = "fddf4e39ba955f8b624b20196cc3ab5fed3fcf0ba78fb79b5893ccac98d60f2fa473f23c3ac0397f9241f080ceb7e55f148aab554cea3d81f2317818b67d6196"

RPROVIDES:${PN} += "tslib-plugins \
tslib-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libts.so.0()(64bit)"

inherit rpm
