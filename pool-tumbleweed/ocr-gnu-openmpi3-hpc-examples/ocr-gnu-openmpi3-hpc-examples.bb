SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-examples-1.0.1-5.8.noarch.rpm"
RPM_HASH = "a8c144ac28d243358c37f40487cddb861cadbeea1836cdf4ad777a26e71153d6347b1d3a5e44672616931e1bf5c3fd526534189bc26080e5772d551f8ac9d335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi3-hpc-examples"

inherit rpm
