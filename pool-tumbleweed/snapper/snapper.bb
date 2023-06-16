SUMMARY = "Tool for filesystem snapshot management"
DESCRIPTION = "This package contains snapper, a tool for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "snapper-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "2cd72f3b0fc1044431dba8d435e102db3cf821e6ee1bf66b93477f22f6609f80ca08d1f8cd2f0f01ad6896887a8da3ffeab606a1fd9f8e39f3d5f56d7ab3acd0"

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
