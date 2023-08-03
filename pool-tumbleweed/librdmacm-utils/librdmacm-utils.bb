SUMMARY = "Examples for the librdmacm library"
DESCRIPTION = "Example test programs for the librdmacm library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "librdmacm-utils-47.0-1.1.aarch64.rpm"
RPM_HASH = "afd1b9b6df91f0fb2bd74c59497d0e71674d89a6191163b082d29cf507ade80b0d2c48a83d1db0e345e742ffa66861c8ac0bd20f0c407b02a09d7c9990e4ed1b"

RPROVIDES:${PN} += "librdmacm-tools \
librdmacm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
