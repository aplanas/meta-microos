SUMMARY = "LXC container runtime library"
DESCRIPTION = "This package provides the LXC container runtime library."
LICENSE = "LGPL-2.1-only"

PV = "5.0.2"

RPM_NAME = "liblxc1-5.0.2-1.2.aarch64.rpm"
RPM_HASH = "d90708d54b6ae3172efb2f400a3020166374733db00d85670606ca43b4a90a03b0be8a1e008a8c77a6b6d243275e9ff53511dbbace56867074a822177d4fed1a"

RPROVIDES:${PN} += "config-liblxc1 \
liblxc.so.1 \
liblxc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
findutils \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1 \
libseccomp.so.2 \
libselinux.so.1 \
libsystemd.so.0 \
permissions"

inherit rpm
