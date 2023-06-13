SUMMARY = "Library for audio de-/encoding with ABME3000 based devices"
DESCRIPTION = "A library that provides an interface for audio encoding and decoding with \
AMBE3000 based devices in packet mode over a serial link."
LICENSE = "GPL-3.0-only"

PV = "1.1.4"

RPM_NAME = "libserialdv1-1.1.4-1.8.aarch64.rpm"
RPM_HASH = "5a7d8cf566894d5df274f963f845d58b35211b1055a9f8af0b382a28fbb5cb3aef385ce4c491bb2d9d777f9c139ad4abd22d5e727b3d5141331cead618a08c0b"

RPROVIDES:${PN} += "libserialdv.so.1()(64bit) \
libserialdv1 \
libserialdv1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
