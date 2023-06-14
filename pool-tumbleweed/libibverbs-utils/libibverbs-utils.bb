SUMMARY = "Examples for the libibverbs library"
DESCRIPTION = "Useful libibverbs example programs such as ibv_devinfo, which \
displays information about RDMA devices."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibverbs-utils-45.0-1.1.aarch64.rpm"
RPM_HASH = "598b781ccfc3ac3a547abdee7aeac827dda31a6c46e8eaec43c208e4abd8aeece58bedf1228f64d836ad46c7a9ea3f97c7770f2c102367f9f7abcdd5ae23d12a"

RPROVIDES:${PN} += "libibverbs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libibverbs.so.1"

inherit rpm
