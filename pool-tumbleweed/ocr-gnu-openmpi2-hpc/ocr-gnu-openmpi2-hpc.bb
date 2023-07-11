SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "babc245ea18c4f9509e28ee70591e886ee8a71bf9847e4aebda64e6406ff46a9f725c4aa6162b050135fd84b3b7a97c7b2ab74541ba9855afbf08332e080bea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi2-hpc"

inherit rpm
