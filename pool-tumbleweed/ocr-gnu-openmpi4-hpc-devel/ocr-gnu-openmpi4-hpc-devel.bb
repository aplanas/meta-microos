SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-devel-1.0.1-5.8.noarch.rpm"
RPM_HASH = "da3bb375783dada623c552249f2e4284102f7bf78d638216c57e1a355f58ffb75f8dca0e24c144b9c77075e74962153e6b492e8dea4aa409823d8d1a0fe4fffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-openmpi4-hpc-devel"

inherit rpm
