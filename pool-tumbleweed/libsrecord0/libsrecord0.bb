SUMMARY = "Srecord libraries"
DESCRIPTION = "This package contains the shared libraries for programs that manipulate EPROM \
load files."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "libsrecord0-1.64-4.32.aarch64.rpm"
RPM_HASH = "c663679727eca43241eed7155cb2127f7da54e45a0ffc7c0a1bb1d4be3d3b7e27a91d02510267c3ce7bf44e81222e857f99809e3f45609036c752bc0d89cf919"

RPROVIDES:${PN} += "libsrecord.so.0()(64bit) \
libsrecord0 \
libsrecord0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
