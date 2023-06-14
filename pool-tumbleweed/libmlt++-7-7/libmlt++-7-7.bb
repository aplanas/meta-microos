SUMMARY = "C++ library API for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the C++ library API for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libmlt++-7-7-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "a3b903cf62dea944b6763bfaf71f96b4b8cb83b411cc4889d5971e4ac24bd3926a813956debb7a97b5616516e5c8d823d687327df028af24a6b3413d4a4fca8e"

RPROVIDES:${PN} += "libmlt++-7-7 \
libmlt++-7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmlt-7.so.7 \
libstdc++.so.6"

inherit rpm
