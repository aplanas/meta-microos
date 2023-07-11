SUMMARY = "Library for manipulation with .zip archives"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "libminizip1-1.2.13-4.2.aarch64.rpm"
RPM_HASH = "a3888759f770a1649d712204d0a5b5dd433e9895abe833626d4696e8b529b5ac24e478d7ad334dfe197b6f61ccf8445835e5b8632bbfc2e8f4532413d2f847f6"

RPROVIDES:${PN} += "libminizip.so.1 \
libminizip1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
