SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-devel-1.0.1-5.8.noarch.rpm"
RPM_HASH = "8c47b8e0daf80ffd57a282c0dc193cd147006e21ba6378f04ba9b1befde340cde35f5fb3d4ec2d368d7ad6866660d8882b5d74e2431c6806a5079c32965aa7ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
ocr-1-0-1-gnu-openmpi1-hpc-devel"

inherit rpm
