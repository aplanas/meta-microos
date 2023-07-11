SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "4440f72e46d080ab679081a16482d6dbca75b477ec8c4fe6c83171a09acf3f4d5a62975623abfb74e4e2e8a911571b21436fdbb95132a40a0d17de2d40967f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi3-hpc"

inherit rpm
