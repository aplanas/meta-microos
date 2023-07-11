SUMMARY = "Generator for grommunio-web search indexes"
DESCRIPTION = "A C++17 program for the generation of grommunio-web fulltext search indexes."
LICENSE = "AGPL-3.0-or-later"

PV = "0.1.18.6a0f73a"

RPM_NAME = "grommunio-index-0.1.18.6a0f73a-1.4.aarch64.rpm"
RPM_HASH = "3fa2cdc1a65feb1de692e16390647a82ed7b1856a6011ca92bcd63a7da3d95f32e3f4fb7cb2bc333ca04097f67be3f2aa47a505908934941a5f42b9210a6080d"

RPROVIDES:${PN} += "grommunio-index"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexmdbpp.so.0 \
libexmdbpp0 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
user-groweb"

inherit rpm
