SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit) network functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjacknet0-1.9.22-2.2.aarch64.rpm"
RPM_HASH = "a067aa8dbdce5b9d4bd9899d6e6003e01410f1395fa7bdfedd1f48a06ccadef0d9009ddc9949251ffedf70aeb6585dd30d92360ca7f8faae884b4ee5e90986e4"

RPROVIDES:${PN} += "libjack0-/usr/lib64/libjacknet.so.0* \
libjacknet.so.0 \
libjacknet0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcelt0.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libopus.so.0 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
