SUMMARY = "A library to detect the natural language of text"
DESCRIPTION = "A library that detects over 80 languages in UTF-8 text, based largely \
on groups of four letters. Also tables for 160+ language versions."
LICENSE = "Apache-2.0"

PV = "20150820"

RPM_NAME = "libcld2-0-20150820-5.10.aarch64.rpm"
RPM_HASH = "717707290ecd1a940a4447de35180d6785ef504847493ff0bcda9c8507b810246f82a6fad0195e835ff60c164772b825f33e4cddc9fec3f3547faa8b85179b5a"

RPROVIDES:${PN} += "libcld2-0 \
libcld2-dynamic.so.0 \
libcld2-full.so.0 \
libcld2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
