SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoRedis94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "06e97840850b58904ddc1d3abb0a69c9920dbc2ad334b4c4645aaf3f95b42ac131b92ce57a94132c56064df16dc47c365ff8c5d0f3716ad44404deb850562930"

RPROVIDES:${PN} += "libPocoRedis.so.94 \
libPocoRedis94 \
poco-redis"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libPocoNet.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
