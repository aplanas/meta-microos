SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-doc-1.0.1-5.10.noarch.rpm"
RPM_HASH = "41ffe68ded77c7f66d2ae31cdc918f08f21789323b8e2781394984e7930b5e7ec8e9bb72dcc5593bca51ff897ed0d623a2afa547d1838c513fb6f29cd22fce18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-mvapich2-hpc-doc"

inherit rpm
