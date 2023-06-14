SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit) network functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjacknet0-1.9.22-2.1.aarch64.rpm"
RPM_HASH = "9328f857c422ad07016e2576e50cbf872a5c6a259a8340a56142d40953b9cc205908a3017f1cc037a23d72960e09df178a43d722cddd649f517c5b9dbc88b98d"

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
