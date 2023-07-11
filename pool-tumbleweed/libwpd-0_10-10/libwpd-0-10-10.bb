SUMMARY = "Library for importing WordPerfect Documents"
DESCRIPTION = "libwpd is a general purpose library for reading or interpreting data \
from WordPerfect files. The library is not a stand-alone utility: it is \
designed to be used by another program (for example, a word processor) \
as an in-process component."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-0_10-10-0.10.3-3.9.aarch64.rpm"
RPM_HASH = "905026c97d01b0db769f471237e2ba96bfc1903d056969e46748aec162c4b13a16e269006ff32d78d738eec656bf3a6f7adca05e01c0d14e85d78ce1e58c79c2"

RPROVIDES:${PN} += "libwpd-0-10-10 \
libwpd-0.10.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
