SUMMARY = "Color Management System"
DESCRIPTION = "SampleICC is a C++ library for reading, writing, manipulating, and \
applying ICC profiles along with applications that make use of this \
library."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "SampleICC-1.6.8-4.9.aarch64.rpm"
RPM_HASH = "f34aa09f109ac2d5fe1a8a06ff7e9d45013dd883dde911754b4953d2e5ac0182d372305b8cd3b7986df041d511aaaffdb6d476496876582a548424be4e21e25a"

RPROVIDES:${PN} += "SampleICC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICC-utils.so.2 \
libSampleICC.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
