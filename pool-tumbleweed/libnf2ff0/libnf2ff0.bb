SUMMARY = "Near-field to far-field transformation library"
DESCRIPTION = "Near-field to far-field transformation library."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "libnf2ff0-0.0.35-5.37.aarch64.rpm"
RPM_HASH = "2be2a165e1a45479ca4bc5bb73e99db5493b6bc1259220e5c41065f1ba452a4e72b87e2e96dae92ecdfb24a70d503fc6327f322a60e79453cb9cd356d45a9539"

RPROVIDES:${PN} += "libnf2ff.so.0 \
libnf2ff0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0"

inherit rpm
