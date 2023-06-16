SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-devel-1.0.1-5.9.noarch.rpm"
RPM_HASH = "a5870819d17364068bd7d35fecbfd5bf669cc9511385532d4b642b4a47abbcd31c69fd88456cb8a581193de904ce2e854bdffc38165538bc389cc432d97775db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-hpc-devel"

inherit rpm
