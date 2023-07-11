SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-1.0.1-5.10.noarch.rpm"
RPM_HASH = "6709e9d1458f73f01e42e7e4f908c601565ff5621592910717e1eec5be607b5e2c132843eb8a0d001d1737ecd60a9bcf345ac84464b1b0a4a53a13f8dbf928ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-mpich-hpc"

inherit rpm
