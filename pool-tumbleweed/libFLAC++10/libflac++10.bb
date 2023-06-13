SUMMARY = "Free Lossless Audio Codec Library"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. \
 \
This package contains the C++ API library for FLAC."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.2"

RPM_NAME = "libFLAC++10-1.4.2-2.3.aarch64.rpm"
RPM_HASH = "0eab403343d7ff6d6315a21dda158ee27589ca46f37a95e4a91250b9d88d805d598d6bf4666fa08d5588918df83eb42c1248e45fe90d0a98df4d44ed14de7314"

RPROVIDES:${PN} += "libFLAC++.so.10()(64bit) \
libFLAC++10 \
libFLAC++10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
