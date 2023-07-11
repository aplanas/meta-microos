SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-doc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "04b3c4bf1b947b5587c3508d5eaccffc45d07e82f71328a353296fd4d36cfe5e8cc274272e9ac2819947e8d83520f636fd671346ddbe65854f09e624b9dc524d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-openmpi2-hpc-doc"

inherit rpm
