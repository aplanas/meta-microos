SUMMARY = "Free Lossless Audio Codec Library"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. \
 \
This package contains the C++ API library for FLAC."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.3"

RPM_NAME = "libFLAC++10-1.4.3-1.1.aarch64.rpm"
RPM_HASH = "b089a3e9e7907d1c6f7a66a85032ce1e9cc11e9b5de2008daa6b04bf90ed7db6a1c36b764bdc2247f5752f61e8c10e7869caefc1ce64cdd9bac955c415d283c3"

RPROVIDES:${PN} += "libFLAC++.so.10 \
libFLAC++10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
