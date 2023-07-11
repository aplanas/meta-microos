SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-1.0.1-5.10.noarch.rpm"
RPM_HASH = "d86216be3ab0446527a45e2c6ecb4061fa0be12013e40f7bbd4230c0b310cea145ce2f283bd93155fa7c98af3064865cb789213a60dd5b158ed5836761f211ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-mvapich2-hpc"

inherit rpm
