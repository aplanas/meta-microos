SUMMARY = "Examples for the libibverbs library"
DESCRIPTION = "Useful libibverbs example programs such as ibv_devinfo, which \
displays information about RDMA devices."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibverbs-utils-47.0-3.1.aarch64.rpm"
RPM_HASH = "69120abd0b828e6b36b50f1e38425309f4c3883a2986796e3131651d5ca570f6f9ace24d769a97c46454b230aab7e0dacbcbc6552e5161e31922039573dd3841"

RPROVIDES:${PN} += "libibverbs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libibverbs.so.1"

inherit rpm
