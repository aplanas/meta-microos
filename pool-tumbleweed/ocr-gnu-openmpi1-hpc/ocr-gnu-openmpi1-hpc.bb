SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "bb3d5540504f71e38d9544f98860b27ebe650d837d4f0d4eb63c46c518dccac2fb097aca039c84761b1ae6db272047071aaa9a17740d578aaabb18845bdf0cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/bin/sh \
ocr-1-0-1-gnu-openmpi1-hpc"

inherit rpm
