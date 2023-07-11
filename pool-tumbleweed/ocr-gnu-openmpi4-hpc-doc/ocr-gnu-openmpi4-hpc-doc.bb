SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-doc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "bbe887baf49530b72841b5c58289434a7da586109dae0862d008e7218dbfb68109249a0b56b5ae01894db6b3da7ade22c57e809bd208d2e225b9d0fd7212ff00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-openmpi4-hpc-doc"

inherit rpm
