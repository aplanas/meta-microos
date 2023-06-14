SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-examples-1.0.1-5.8.noarch.rpm"
RPM_HASH = "69813a796abb27f152d3c4d664aab2e1ff2078659910131938cc054f2b2383d4e55f6acff9f299f2c2b38dc6563138114c859cac35cb93ab7dff93ea1ae34e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc-examples"

RDEPENDS:${PN} += "/bin/sh \
ocr-1-0-1-gnu-openmpi2-hpc-examples"

inherit rpm
