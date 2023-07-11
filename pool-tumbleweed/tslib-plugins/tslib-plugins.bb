SUMMARY = "Driver plugins for tslib, an abstraction layer for touchscreens"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed. \
 \
This subpackage contains the hardware driver plugins for tslib."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "tslib-plugins-1.22-1.10.aarch64.rpm"
RPM_HASH = "e71216a249236f65ef0b836581c4604f2d2f06910f1f5623d80c549df6b4a7dea148ecf9bbcbafbed10598c18da4bf49c91fc6321e4529eb8d9fea7da3ea0a8e"

RPROVIDES:${PN} += "tslib-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libts.so.0"

inherit rpm
