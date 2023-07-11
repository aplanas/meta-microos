SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-devel-1.0.1-5.9.noarch.rpm"
RPM_HASH = "ca58a4880597772e4f0c59bca2221272ee82ee708032fe20cc5fd1b7f33f5223012363fb27e8d1e01b1429fa9b0e75b368f61fb634babdafa4846a5fb92fdc72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi1-hpc-devel"

inherit rpm
