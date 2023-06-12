SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "75b339cfca73ce9f73a724bbb4d695a9807b4be9fb29a36a5b5e4be321a3134dcfd61846db7474971e3a68e24fafa02d547fda53f67e6141ad6f7af197d5a6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-openmpi2-hpc"

inherit rpm
