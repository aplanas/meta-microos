SUMMARY = "Communication library used by PMI-X"
DESCRIPTION = "This package contains the communication library used by the PMI"
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "libmca_common_dstore1-3.2.3-10.2.aarch64.rpm"
RPM_HASH = "7802ae0635e9e6a9f5b89ae7750eb4ba3d78b508ed9f460c70091e7b93997c837c6f525418d1a7611fb0446975278c50ef6f01f9c7a6572e2f9e152f3543a35d"

RPROVIDES:${PN} += "libmca-common-dstore.so.1 \
libmca-common-dstore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
