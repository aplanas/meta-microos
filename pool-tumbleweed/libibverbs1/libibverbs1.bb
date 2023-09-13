SUMMARY = "Ibverbs runtime library"
DESCRIPTION = "This package contains the ibverbs runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibverbs1-47.0-3.1.aarch64.rpm"
RPM_HASH = "1d546a69214cb3033b8a655a0d8951ff58d659b6fbcc8b8cdd42647996fad50381072fcde4fb0983c7455e7885ef8b2426e0c696bcbb5bfe5c951ade02adb317"

RPROVIDES:${PN} += "libibverbs.so.1 \
libibverbs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
