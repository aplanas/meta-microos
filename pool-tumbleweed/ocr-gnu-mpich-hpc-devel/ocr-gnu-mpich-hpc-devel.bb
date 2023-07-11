SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-devel-1.0.1-5.10.noarch.rpm"
RPM_HASH = "de9a9308dadb9b6fcbabd24dc9533729c0dc9158c98bd5fe93d3b14d5c15527bfa40c0f7e64bed94567c1eb9f0c496e182b7dc562a4f50be5a2716867a0d628e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-mpich-hpc-devel"

inherit rpm
