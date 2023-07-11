SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-examples-1.0.1-5.10.noarch.rpm"
RPM_HASH = "d6f7f1efeeeba93db0867cfbc41d162b081f78b64218202096295a038852e6f7920172bb7962fb62f77f1a9c84b64238b5d728521f3c7a3e649c821fdac5bc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-hpc-examples"

inherit rpm
