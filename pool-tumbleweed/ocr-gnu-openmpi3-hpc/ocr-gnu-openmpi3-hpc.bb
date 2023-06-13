SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-1.0.1-5.7.noarch.rpm"
RPM_HASH = "8359e733afbf7de6c1e8d934d9a9aa01b9fcae48ca5ba6ff87fcfd798d5ea5fe9e7b65c2c435e530099fcbe6e0913288ded1440b28f2b3563b3d296974836665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-openmpi3-hpc"

inherit rpm
