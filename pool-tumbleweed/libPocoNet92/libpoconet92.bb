SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoNet92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "81aef0ea4326fc61d08f61c359812a9f054eb671dec5eec511de3df31f85c1b75adebaad7e5987ba51cf6883a94d6b88da76d414ea453eac4be21c04633ff552"

RPROVIDES:${PN} += "libPocoNet.so.92 \
libPocoNet92 \
poco-net"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
