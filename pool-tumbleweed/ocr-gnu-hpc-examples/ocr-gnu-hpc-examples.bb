SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-examples-1.0.1-5.9.noarch.rpm"
RPM_HASH = "e570f202c36719b8828af3f9bcd2b3998810c9c90404ebadb201bf8e17a458ba09f059fbf1e27637a76b5c6145078843c1d1db656d23c248f403a09fa3e8985c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc-examples"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-hpc-examples"

inherit rpm
