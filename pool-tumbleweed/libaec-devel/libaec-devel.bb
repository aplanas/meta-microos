SUMMARY = "Development files for libaec (Adaptive Entropy Coding library)"
DESCRIPTION = "Development files for libaec (Adaptive Entropy Coding library), a lossless \
compression library for low entropy data."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "libaec-devel-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "def041800bb245c5488c6551237a4015c0614918bb05ef8433f7344e4c009295dea44a11a18eb9c1b41448474eed053948f2b0b48358071882a9c444427dbf60"

RPROVIDES:${PN} += "cmake-libaec \
libaec-devel"

RDEPENDS:${PN} += "libaec0"

inherit rpm
