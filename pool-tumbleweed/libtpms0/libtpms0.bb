SUMMARY = "Library providing Trusted Platform Module (TPM) functionality"
DESCRIPTION = "A library providing TPM functionality for VMs. Targeted for integration \
into Qemu."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "libtpms0-0.9.6-1.3.aarch64.rpm"
RPM_HASH = "d14d19ae6f274d92b75fa42f5dab59269b412efb91e95d5809bb5382c0a0dcc4462a4e6dbc9bddc97893f44eccf425100a96537e32f97fc60ab7edab05f47dbc"

RPROVIDES:${PN} += "libtpms.so.0 \
libtpms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
