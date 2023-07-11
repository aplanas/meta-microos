SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-devel-1.0.1-5.8.noarch.rpm"
RPM_HASH = "e846f68c5ad63be8a3e9ddefbce4b0389dfa85f0bae3714cc465c4a026a9d390a8be5f273c9366f754de6b020d584658396b3c08de801433e3a87920f307cda9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi3-hpc-devel"

inherit rpm
