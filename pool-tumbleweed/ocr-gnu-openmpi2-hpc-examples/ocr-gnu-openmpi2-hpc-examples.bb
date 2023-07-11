SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-examples-1.0.1-5.9.noarch.rpm"
RPM_HASH = "d976fafae3188a42e856f7757ab7ca47085abb8b33224c744ab018b1ff7f16907927f1cb265c75df07e7050bc6f77f3060bdfbecaa5a08f1d70e57ecb944cac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi2-hpc-examples"

inherit rpm
