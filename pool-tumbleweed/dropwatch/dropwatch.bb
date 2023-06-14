SUMMARY = "Kernel dropped packet monitor"
DESCRIPTION = "dropwatch is an interactive utility for monitoring and recording packets that \
are dropped by the kernel"
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "dropwatch-1.5.4-1.5.aarch64.rpm"
RPM_HASH = "31bd6da377891a504a0cd2cb1f761f06b255851dfe1376726019e84d11ee850e7010df36ce18efaa7ce4838878f79269f9bc6bd77c67e9074405e56b5b52d072"

RPROVIDES:${PN} += "dropwatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpcap.so.1 \
libreadline.so.8"

inherit rpm
