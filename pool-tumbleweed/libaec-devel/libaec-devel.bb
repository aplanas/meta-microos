SUMMARY = "Development files for libaec (Adaptive Entropy Coding library)"
DESCRIPTION = "Development files for libaec (Adaptive Entropy Coding library), a lossless \
compression library for low entropy data."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "libaec-devel-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "c423b1d612a1270f143c410a46f9db6a533c744baada48a19714dc30bf64b2cb3e2583281fce2b3b04f9d74769772282e41de72bb8aa929c0f7271853ed47231"

RPROVIDES:${PN} += "cmake-libaec \
libaec-devel"

RDEPENDS:${PN} += "libaec0"

inherit rpm
