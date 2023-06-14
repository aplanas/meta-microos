SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-devel-1.0.1-5.8.noarch.rpm"
RPM_HASH = "783d57796a3f70bbdc992ce37ad43178403bc72b8f9fc85c1ad8667245a822e2424579fd493b75a78cd7c120eb5e52470be3c3fdc07ef66870530897aadfc929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
ocr-1-0-1-gnu-openmpi2-hpc-devel"

inherit rpm
