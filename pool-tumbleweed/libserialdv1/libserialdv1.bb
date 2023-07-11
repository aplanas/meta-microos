SUMMARY = "Library for audio de-/encoding with ABME3000 based devices"
DESCRIPTION = "A library that provides an interface for audio encoding and decoding with \
AMBE3000 based devices in packet mode over a serial link."
LICENSE = "GPL-3.0-only"

PV = "1.1.4"

RPM_NAME = "libserialdv1-1.1.4-1.9.aarch64.rpm"
RPM_HASH = "36fd7152c6a9794fa5f2a9a7693d0a579d79f2bc663efdff753e8280b90a80d545e42104b0d712e3d39f1fb8e5074e77a93ca41b350d08fec188e6caabb6147a"

RPROVIDES:${PN} += "libserialdv.so.1 \
libserialdv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
