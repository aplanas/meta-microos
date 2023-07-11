SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-doc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "637b68cf4f908a161442e2b0a4891840efdfc8bacb13209ac90605975060a3c054e7c7da51202d631e3b59cbb55b86278996fb1dc668008fb4c3415414a7eb94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-openmpi3-hpc-doc"

inherit rpm
