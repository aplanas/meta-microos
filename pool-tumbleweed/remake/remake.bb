SUMMARY = "A gnu make version including a debuger"
DESCRIPTION = "remake is a patched and modernized version of GNU make utility that \
adds improved error reporting, the ability to trace execution in a \
comprehensible way, and a debugger."
LICENSE = "GPL-3.0-or-later"

PV = "4.3_1.5"

RPM_NAME = "remake-4.3_1.5-1.11.aarch64.rpm"
RPM_HASH = "6151a6afcb47979b15be2c4e3c1da4fdacd05bc9a6397c3f8eda30370ac8bee7e2b09ea706ba622fbcc0ce5df544474d35ba45900bd1d436d4bf8984cc66210d"

RPROVIDES:${PN} += "remake"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
