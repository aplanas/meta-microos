SUMMARY = "C library providing BLAKE2b, BLAKE2s, BLAKE2bp, BLAKE2sp"
DESCRIPTION = "C library providing BLAKE2b, BLAKE2s, BLAKE2bp, BLAKE2sp. \
 \
BLAKE2 is a cryptographic hash function faster than MD5, SHA-1, SHA-2, \
and SHA-3, yet is at least as secure as the latest standard SHA-3."
LICENSE = "CC0-1.0"

PV = "0.98.1"

RPM_NAME = "libb2-1-0.98.1-1.13.aarch64.rpm"
RPM_HASH = "6b7eaa7d2fda86049478e40feb0745ad32d3c94ffb4d6cb574a755eafb9cb0cb87baad5d767185ec88538290ba434f4c9e969e4b1b4add9174952879b8534810"

RPROVIDES:${PN} += "libb2-1 \
libb2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgomp.so.1"

inherit rpm
