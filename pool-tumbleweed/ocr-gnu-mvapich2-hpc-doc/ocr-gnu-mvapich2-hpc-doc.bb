SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-doc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "bb7cb18b0802fe1fb7dcdf82b025fd55ae317cdb8d232e39a379292dc857a1ae0a4d58d0008d2096d471ea3f5816f2a6de957682f7ba835158e3fb99d5153e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += "ocr_1_0_1-gnu-mvapich2-hpc-doc"

inherit rpm
