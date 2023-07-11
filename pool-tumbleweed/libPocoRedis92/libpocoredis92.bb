SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoRedis92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "2e0048fb1e15c4ecda30143f3df668f585f81493b6f565f0362c4edfdcd28de1d07469cfccf228431b75a27403bbabd3348281522f9494977ffcdc480c0eeff9"

RPROVIDES:${PN} += "libPocoRedis.so.92 \
libPocoRedis92 \
poco-redis"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoNet.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
