SUMMARY = "Abstraction layer for touchscreen"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "tslib-1.22-1.10.aarch64.rpm"
RPM_HASH = "997189fff266482603a13599d338a661b6c445239409eb5ede6e080fec9fbe3f2c29fcc9c34c9d7a83d774e343b6f298bcac522f44c78f717d0632865667104a"

RPROVIDES:${PN} += "config-tslib \
tslib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libts.so.0"

inherit rpm
