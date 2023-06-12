SUMMARY = "Dependency package for ocr_1_0_1-gnu-mpich-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mpich-hpc provides the dependency to get binary package ocr_1_0_1-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mpich-hpc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "078b35b380dcac7378519f22a9a9f36e0882174822264fd22cac15d3354842fdbf452af00a18f488f4efc4284f64fc374196f66ca2d634fe91f90841d4eec0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mpich-hpc"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-mpich-hpc"

inherit rpm
