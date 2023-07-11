SUMMARY = "Tool from libwpd, a library for importing WordPerfect documents"
DESCRIPTION = "Tools to transform WordPerfect Documents into other formats. Currently \
supported: html, raw, text"
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-tools-0.10.3-3.9.aarch64.rpm"
RPM_HASH = "40136311d2a6f08ab9e29637c7468344f36fdedecea991ca48bc3ca7339d90ae6b9c1a08c773a21464232f8804dd132817ba77717f4f2d552c75e906847ad106"

RPROVIDES:${PN} += "libwpd-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libwpd-0.10.so.10"

inherit rpm
