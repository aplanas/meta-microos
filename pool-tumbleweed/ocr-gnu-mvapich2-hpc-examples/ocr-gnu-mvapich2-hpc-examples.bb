SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-examples-1.0.1-5.10.noarch.rpm"
RPM_HASH = "c3a72247eadf264f6c3d8a351fcb23e05b227d55c2d25d2a4554f05c91956564735af9b066e0948ac0cda187ed7dfece5667dd7b67a914301f9e5e3f50f741ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-mvapich2-hpc-examples"

inherit rpm
