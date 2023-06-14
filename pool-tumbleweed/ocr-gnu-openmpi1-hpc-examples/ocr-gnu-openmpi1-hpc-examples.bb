SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-examples-1.0.1-5.8.noarch.rpm"
RPM_HASH = "4ccf4668bfec3cb212ee4897c757d6df47a207ff2224b6a600a9579ccde2bbd56f9f84b704d5caf7f21c3c80bdaee2cfd4c98a09e2de24417ec09c6ac5878082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc-examples"

RDEPENDS:${PN} += "/bin/sh \
ocr-1-0-1-gnu-openmpi1-hpc-examples"

inherit rpm
