SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-examples-1.0.1-5.9.noarch.rpm"
RPM_HASH = "f3868bfe0ec21d0340d1380fe9beee46cab4e952b4ba756e7fd66b7cac172bc57c217d61bc1386f5ecb36e3e43da1847dfe87121bd23cf8719fcdfa02a11b6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi4-hpc-examples"

inherit rpm
