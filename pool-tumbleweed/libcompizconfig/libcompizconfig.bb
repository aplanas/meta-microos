SUMMARY = "CompizConfig plugin required for CCSM"
DESCRIPTION = "CompizConfig plugin required for compizconfig-settings-manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "libcompizconfig-0.8.18-2.12.aarch64.rpm"
RPM_HASH = "5fa13b93a8c765faa13b9c483bbfb6709e4754ed32d00a50e872f387db9b1911703f459fa90f567f2795bb536b18f486f8c605fac4e6641d99f03cc29f725937"

RPROVIDES:${PN} += "config-libcompizconfig \
libccp.so \
libcompizconfig \
libcompizconfig.so.0 \
libini.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
compiz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
