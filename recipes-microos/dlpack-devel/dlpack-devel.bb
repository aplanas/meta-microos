SUMMARY = "DLPack: Open In Memory Tensor Structure"
DESCRIPTION = "DLPack is an open in-memory tensor structure to for sharing tensor among frameworks. DLPack enables: \
 * Easier sharing of operators between deep learning frameworks. \
 * Easier wrapping of vendor level operator implementations, allowing collaboration when introducing new devices/ops. \
 * Quick swapping of backend implementations, like different version of BLAS \
 * For final users, this could bring more operators, and possibility of mixing usage between frameworks."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "dlpack-devel-0.8-1.2.aarch64.rpm"
RPM_HASH = "cad408cd8512fc3634cdf591fe955daa5319696a2786a396e9c5b0c03c467f82f2d0a9bfdf0ef5f2d5079d7a73a291a1e5e03cff0b876e64bac6500780ed23a4"

RPROVIDES:${PN} += "cmake(dlpack) dlpack-devel dlpack-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
