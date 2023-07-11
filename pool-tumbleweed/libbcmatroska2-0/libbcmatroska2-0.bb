SUMMARY = "C Library to Deal with Matroska Files"
DESCRIPTION = "Bcmatroska2 is a C library to parse Matroska files (.mkv and .mka)."
LICENSE = "BSD-3-Clause & Zlib & GPL-2.0-or-later"

PV = "5.2.1"

RPM_NAME = "libbcmatroska2-0-5.2.1-1.4.aarch64.rpm"
RPM_HASH = "29139f04a3926f6e8f1e45f65b3a997816907a064743c66578c4f3e9fd73b01478f7855839f23d8617e89bb30384307f13022ae28ce7d40aff13c6788739c39a"

RPROVIDES:${PN} += "libbcmatroska2-0 \
libbcmatroska2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6"

inherit rpm
