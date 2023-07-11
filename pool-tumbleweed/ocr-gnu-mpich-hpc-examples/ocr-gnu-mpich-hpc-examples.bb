SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-examples-1.0.1-5.10.noarch.rpm"
RPM_HASH = "3c7ba343410ad8ef37cd50a45f9d8e8f2c349a541a9d5c2d1cbdbfa45d379b060080e0c0faff387bf2c56e7803203a277aae2216d76a30f27d3c3043473e76eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-mpich-hpc-examples"

inherit rpm
