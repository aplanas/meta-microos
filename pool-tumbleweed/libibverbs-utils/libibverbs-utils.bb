SUMMARY = "Examples for the libibverbs library"
DESCRIPTION = "Useful libibverbs example programs such as ibv_devinfo, which \
displays information about RDMA devices."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibverbs-utils-45.0-1.2.aarch64.rpm"
RPM_HASH = "4af16711f74ae56027804731c925886903f2e683c3da756273fb30ed75e8ac48d157d9f645c3e5623de1dba1926d4db950a522a17b1c4e2c3849adc8dec2ef1f"

RPROVIDES:${PN} += "libibverbs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libibverbs.so.1"

inherit rpm
