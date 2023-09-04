SUMMARY = "C++ library to manipulate vCard standard format files"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "libbelcard1-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "8ae17eb7ae66007364c42b107fda16cfc10e26a3dde905f4ecfc0e19d2a252c3a41947bb0701e1ee55ea300086a6be0edf39055f9060830df22d305a45465f27"

RPROVIDES:${PN} += "libbelcard.so.1 \
libbelcard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
belcard-data \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbelr.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
