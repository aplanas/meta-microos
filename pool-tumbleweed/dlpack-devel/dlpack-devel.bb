SUMMARY = "DLPack: Open In Memory Tensor Structure"
DESCRIPTION = "DLPack is an open in-memory tensor structure to for sharing tensor among frameworks. DLPack enables: \
 * Easier sharing of operators between deep learning frameworks. \
 * Easier wrapping of vendor level operator implementations, allowing collaboration when introducing new devices/ops. \
 * Quick swapping of backend implementations, like different version of BLAS \
 * For final users, this could bring more operators, and possibility of mixing usage between frameworks."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "dlpack-devel-0.8-1.3.aarch64.rpm"
RPM_HASH = "51dee02ce552a74b2d4db58373e62b450f02202941c28b6f4580a0df2de30a589967ee31add3af1bace27d013c2065b53506facb070a01d2774e8892b7dcac44"

RPROVIDES:${PN} += "cmake-dlpack \
dlpack-devel"

RDEPENDS:${PN} += ""

inherit rpm
