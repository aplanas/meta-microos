SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "ebf52c7937a79a8169f16c1ad259d1bef78590c438e12a96b925747b437bfacf9efa84dc28dd1b35afaaa14ca0fefdf4d461dfc30ca8d9da9324ae46cd292f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-openmpi4-hpc"

inherit rpm
