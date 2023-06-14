SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-examples-1.0.1-5.7.noarch.rpm"
RPM_HASH = "0435a3d25e5aeb80d6df0870bdbe2f47dd2cda52d3a3df684d038007e2c0ea512082d97708ccaf857b46a30847714e680ca56c48072e6f93d12df53bfe01fb2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc-examples"

RDEPENDS:${PN} += "/bin/sh \
ocr-1-0-1-gnu-openmpi3-hpc-examples"

inherit rpm
