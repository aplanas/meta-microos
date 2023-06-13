SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-doc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "53fff88f6bf52fbeacca01c55c1cb2a7510e431292a9e44ed10b984a07ae343f1cef6c63e364ab9143ea5e8dad32d5110d882099072d6faf0652b6ef5c8c2b17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += "ocr_1_0_1-gnu-mpich-hpc-doc"

inherit rpm
