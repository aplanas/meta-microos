SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "c307db625dfdd964912f9b4b1436f2dd1a24adff22cd8853cc5dc0fcebb9582cbfdb714205ee0b722991c708353a2390c463e13ced3a6bbced40d8a7062dacc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/bin/sh \
ocr-1-0-1-gnu-mvapich2-hpc"

inherit rpm
