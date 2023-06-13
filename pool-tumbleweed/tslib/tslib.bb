SUMMARY = "Abstraction layer for touchscreen"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "tslib-1.22-1.9.aarch64.rpm"
RPM_HASH = "0d8dddf660cb338e910f7c28cdf3afdadc26c9bde6d0d8effca93eb1fb702d443f57815a24219e2a28b5164bd4d92614a14e874c9b85d787ee33768d977130f7"

RPROVIDES:${PN} += "config(tslib) \
tslib \
tslib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libts.so.0()(64bit)"

inherit rpm
