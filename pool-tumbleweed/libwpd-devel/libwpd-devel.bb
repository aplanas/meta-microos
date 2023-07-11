SUMMARY = "Development files for libwpd, a library for importing WordPerfect documents"
DESCRIPTION = "libwpd is a general purpose library for reading (or, interpreting data \
from) WordPerfect files. The library is not a stand-alone utility: it \
is designed to be used by another program (e.g.: a word processor) as \
an in-process component."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-devel-0.10.3-3.9.aarch64.rpm"
RPM_HASH = "9abf7ba2955f6b9f6e6ccf1a048c9472fc4bebab63edc225f1ae5aede69a914b76723934c691f5c730b9f2170fcb6e969cf53e1005918a1d1fe689d537d4c163"

RPROVIDES:${PN} += "libwpd-devel \
pkgconfig-libwpd-0.10"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel \
libwpd-0-10-10 \
pkgconfig-librevenge-0.0"

inherit rpm
