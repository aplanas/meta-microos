SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-devel-1.0.1-5.9.noarch.rpm"
RPM_HASH = "d641e823f46941649f0c48e5adbf45a50314c3179ec28fa1dcbd63f0686818f72e4f81b5b5a9976f428710036dbea21ae002353d07e7b97866bce6419c3513ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi2-hpc-devel"

inherit rpm
