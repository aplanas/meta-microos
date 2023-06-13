SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-doc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "baf854e4db1ca7cbf9a9d660892e061638fa3b40f2300b1578a38643d43372624c073ca20908e8267ffc49c6de9e3fed54708de6ef97ccf36bd28e78725249fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += "ocr_1_0_1-gnu-openmpi4-hpc-doc"

inherit rpm
