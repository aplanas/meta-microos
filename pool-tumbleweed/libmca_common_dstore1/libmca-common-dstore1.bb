SUMMARY = "Communication library used by PMI-X"
DESCRIPTION = "This package contains the communication library used by the PMI"
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "libmca_common_dstore1-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "774c2e92d8d3c186cdfb3fccc2ea90638f7fd746c5056ba69e316f98054ed991d72b3ca8ea72af23c44747a592103ae4b5164e6339d3b3118640e196341393d4"

RPROVIDES:${PN} += "libmca_common_dstore.so.1()(64bit) \
libmca_common_dstore1 \
libmca_common_dstore1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
