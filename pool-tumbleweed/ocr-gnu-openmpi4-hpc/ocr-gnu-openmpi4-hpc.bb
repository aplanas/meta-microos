SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "d2fd8e5d15f1e3a35da288127de242a8cecb40a7806e4bf39858f65bb9290ce13f62f0f76b73f2961832253e09ef70dead6aebeea451a4a615454bbf75dbbddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi4-hpc"

inherit rpm
