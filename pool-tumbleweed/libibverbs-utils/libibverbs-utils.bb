SUMMARY = "Examples for the libibverbs library"
DESCRIPTION = "Useful libibverbs example programs such as ibv_devinfo, which \
displays information about RDMA devices."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibverbs-utils-47.0-2.2.aarch64.rpm"
RPM_HASH = "d4034e1a3267dc1d0e7004546feb2377dbe5ec1986f3c17b8f093ae05a49d1151506126812d69112bfe84efe7fafad790d2147bf52b3baf985b837b41dd31f15"

RPROVIDES:${PN} += "libibverbs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libibverbs.so.1"

inherit rpm
