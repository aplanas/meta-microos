SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-devel-1.0.1-5.10.noarch.rpm"
RPM_HASH = "534d5b5f8d629453b87a58b25ba7259045d710872349f2ec4c9ca4f04ae51430a6b40d164dc57715c7b5a09d489b19d76e04f9525aacf4340e8bab1d642acf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-mvapich2-hpc-devel"

inherit rpm
