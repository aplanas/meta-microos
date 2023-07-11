SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-devel-1.0.1-5.9.noarch.rpm"
RPM_HASH = "d753583c475205a28272fc11401742f2bdfec0a11936b96f1d77e09f16af945fdcf99da48b38b83001c1c087574a3d8d8fa5b8847a89cb1bd9a7d4dbd2aa13ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi4-hpc-devel"

inherit rpm
