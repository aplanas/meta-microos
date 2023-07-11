SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-doc-1.0.1-5.10.noarch.rpm"
RPM_HASH = "3fd3e0527c956cc8e38db9169f6a01a712ef9368f460d0e70b96c05ce9fdb6a134b0123d05e9585a80b68d5193ca780f1fec78f8ff13b720aa53c66889a4cc03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-hpc-doc"

inherit rpm
