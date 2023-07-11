SUMMARY = "Development files for libserialdv"
DESCRIPTION = "A library that provides an interface for audio encoding and decoding with \
AMBE3000 based devices in packet mode over a serial link. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libserialdv."
LICENSE = "GPL-3.0-only"

PV = "1.1.4"

RPM_NAME = "serialdv-devel-1.1.4-1.9.aarch64.rpm"
RPM_HASH = "1298d4a4a7a3f9c6d12a7dffe9cddc41dec93714dbbc761df4162f6e7af02b00cb1d6540b0bd39fdc7648883683d671f5d29f8a9fd5de3489c390420a91a9dd9"

RPROVIDES:${PN} += "serialdv-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libserialdv.so.1 \
libserialdv1 \
libstdc++.so.6"

inherit rpm
