SUMMARY = "Tool for filesystem snapshot management"
DESCRIPTION = "This package contains snapper, a tool for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "snapper-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "2cd72f3b0fc1044431dba8d435e102db3cf821e6ee1bf66b93477f22f6609f80ca08d1f8cd2f0f01ad6896887a8da3ffeab606a1fd9f8e39f3d5f56d7ab3acd0"

RPROVIDES:${PN} += "snapper \
snapper(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
diffutils \
ld-linux-aarch64.so.1()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit) \
libmount.so.1()(64bit) \
libsnapper.so.7()(64bit) \
libsnapper7 \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
systemd"

inherit rpm
