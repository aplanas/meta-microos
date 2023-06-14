SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-doc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "153e1069e0560deb188409af5edbaf5dea52a4d6e9be229ac623834086ef8058afd1b380ce64c04aee38d9d7b4cc8f8d23d3d3db9f4358f77cb5323e3dffc334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-openmpi1-hpc-doc"

inherit rpm
