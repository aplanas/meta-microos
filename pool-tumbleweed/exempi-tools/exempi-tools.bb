SUMMARY = "Tools from Exempi, an XMP support library"
DESCRIPTION = "Exempi is a library for XMP parsing and I/O. XMP is a kind of \
metadata for images and PDF. \
 \
This subpackage contains utilities from the Exempi project."
LICENSE = "BSD-3-Clause"

PV = "2.6.3"

RPM_NAME = "exempi-tools-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "6bd999859bceb2baed0042fc49f9b46b001033ecdd1dc9baff031ae413c86cff26cff1f0e19937dd58d4bf2531cf62bbaf3b814d2ca4ed05e2399f7c2d5320d9"

RPROVIDES:${PN} += "exempi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexempi.so.8 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
