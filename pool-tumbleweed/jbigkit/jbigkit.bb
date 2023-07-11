SUMMARY = "JBIG1 lossless image compression tools"
DESCRIPTION = "The jbigkit package contains tools for converting between PBM and JBIG1 \
formats."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "jbigkit-2.1-4.5.aarch64.rpm"
RPM_HASH = "10449a2ae6d72a61546d19f90971a434ccd3643c05166f58b1860d6aa3d0bd2acc7f8aeb1344f0b5b2aa936147cf2862bd51c5238a4a97ecb51ed1348cc23899"

RPROVIDES:${PN} += "jbigkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjbig.so.2 \
libjbig85.so.2"

inherit rpm
