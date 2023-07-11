SUMMARY = "Tool for filesystem snapshot management"
DESCRIPTION = "This package contains snapper, a tool for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "snapper-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "d829c102b8b9c0d48a9c8d84b875833714b6f76f9a10f7ecc01c41565fc9a1f5f334356c6401eb20f3cffd29049a0abf20e768299845466fb11b0ba758103fdf"

RPROVIDES:${PN} += "snapper"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libmount.so.1 \
libsnapper.so.7 \
libsnapper7 \
libstdc++.so.6 \
libtinfo.so.6 \
systemd"

inherit rpm
