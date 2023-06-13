SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-doc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "58ccd4a3656e6500efab3b352f32ac4da1a68dc59669da0ff2c79bdd7dbedbbc68d3e6f6eab6fe47ca2d6b394448805cf5d9cacb705a6a0cace72051aff6fe70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc-doc"

RDEPENDS:${PN} += "ocr_1_0_1-gnu-hpc-doc"

inherit rpm
