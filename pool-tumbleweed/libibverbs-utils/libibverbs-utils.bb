SUMMARY = "Examples for the libibverbs library"
DESCRIPTION = "Useful libibverbs example programs such as ibv_devinfo, which \
displays information about RDMA devices."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibverbs-utils-47.0-1.1.aarch64.rpm"
RPM_HASH = "053aa3bae0b6e8def4b9916f468967dc125e92d065cebbc7676eaadee6eca8934b415a48a6ba5755a4952c098efe55237e42f0c7bec6b5067d131297611e6f26"

RPROVIDES:${PN} += "libibverbs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libibverbs.so.1"

inherit rpm
