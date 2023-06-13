SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-examples-1.0.1-5.9.noarch.rpm"
RPM_HASH = "a028bdd6c775107a76116d95d2bf5de80b3ed6d86a106b1c134b1edb689c891205abac3410f0266f3de9fac914aff5d87777daeb9d19a0270f57bfbffae8c031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc-examples"

RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-mpich-hpc-examples"

inherit rpm
