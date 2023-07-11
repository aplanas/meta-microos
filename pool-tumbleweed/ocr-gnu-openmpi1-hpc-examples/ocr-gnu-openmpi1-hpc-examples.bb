SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi1-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi1-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi1-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi1-hpc-examples-1.0.1-5.9.noarch.rpm"
RPM_HASH = "34c45d823d0608277938040f7f6860b538ebb83b255120e68419ac7043f05b24a93f8b11a0485816f2a4177b13a22dee314558bdbc17b6371e4cc2ba53237a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi1-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-openmpi1-hpc-examples"

inherit rpm
