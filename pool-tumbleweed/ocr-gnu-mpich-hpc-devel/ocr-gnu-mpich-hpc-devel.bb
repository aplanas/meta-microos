SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-devel-1.0.1-5.9.noarch.rpm"
RPM_HASH = "1680bd4bb5b4e52156b0e82cf0eaa11bd78986c13285b06857df658bff7971a99c93d11a53a7aae767695d5a53f596a329f437c592dfb38237c44631a3c6019d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-mpich-hpc-devel"

inherit rpm
