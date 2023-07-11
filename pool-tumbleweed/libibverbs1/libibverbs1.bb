SUMMARY = "Ibverbs runtime library"
DESCRIPTION = "This package contains the ibverbs runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibverbs1-45.0-1.2.aarch64.rpm"
RPM_HASH = "8d6c94dfb81cd93640ea5a8ef36223a42332707f6b1fec421adffae3163bc32fd65e33d910370bdd0d55a0e411bef814b99078a7f6b481a218447fca898c3fd9"

RPROVIDES:${PN} += "libibverbs.so.1 \
libibverbs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
