SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-doc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "8f5f423db3534ee0530cdfa01faa1fdb71791ee0e0ff87e20e03bff19824a98969e81cf73d0bd5e23bfce39e07144b02eb6457804e4949b1bfd57c561f295453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += "ocr-1-0-1-gnu-openmpi1-hpc-doc"

inherit rpm
