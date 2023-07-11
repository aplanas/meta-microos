SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "5437cf8b6c34d666755c8304772a0be50547ca049b228a8097ead9b298c5f2dcf091bc2fe45633ab931cea3d841fd2393f408871d43868f7f6ebd5f7e97387e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi1-hpc"

inherit rpm
