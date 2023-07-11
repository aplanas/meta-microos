SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-doc-1.0.1-5.10.noarch.rpm"
RPM_HASH = "0ab697532387d3c171b634a1e5630886f39d4fd1150ca2f13bdb66884cbbe5c098029d099230e49c3f2ab35e1a2800e4ce662650d00430070fee84226833b26e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-mpich-hpc-doc"

inherit rpm
