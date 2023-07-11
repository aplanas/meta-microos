SUMMARY = "Library providing Trusted Platform Module (TPM) functionality"
DESCRIPTION = "A library providing TPM functionality for VMs. Targeted for integration \
into Qemu."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "libtpms0-0.9.6-1.4.aarch64.rpm"
RPM_HASH = "725af968e870ced2c2d457e8d3233de2d529fd5386105203f0d5fbf054bd59ac096ae88ce94b1b1b9b0d634b06e2c3191b0831f103135d55c566f02c1c08e417"

RPROVIDES:${PN} += "libtpms.so.0 \
libtpms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
