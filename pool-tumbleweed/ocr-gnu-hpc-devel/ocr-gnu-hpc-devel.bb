SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-devel-1.0.1-5.10.noarch.rpm"
RPM_HASH = "c9f7d1935c7db2f424039f1883ea34650513548c1591c0a17c3e4a6cb6ebd286200846d6ffafec144607dae3fb94f15c0e911fb9f4a1159122b9e311ecf71b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-hpc-devel"

inherit rpm
