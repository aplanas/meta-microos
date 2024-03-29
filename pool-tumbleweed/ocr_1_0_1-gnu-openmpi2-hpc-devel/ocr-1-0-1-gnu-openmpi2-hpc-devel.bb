SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-devel-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "4582721a37c2e014579086a355a8416b0d681354c959d604beb357c3ce432e3aa8f58a8f152da526e66f886c83f5ace91879012926820f692b08d274b3d4c53b"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr-1-0-1-gnu-openmpi2-hpc \
openmpi2-gnu-hpc-devel"

inherit rpm
