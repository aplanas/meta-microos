SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc provides the dependency to get binary package ocr_1_0_1-gnu-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-1.0.1-5.10.noarch.rpm"
RPM_HASH = "50fece592011cf6ff5a74a089085821e3d0315253572c21db8853f2ca416f4cd3f0e33d0bf3f71c417b227c9fe6fddc4d0214d75f306f92292f2a7cf52547c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ocr-1-0-1-gnu-hpc"

inherit rpm
