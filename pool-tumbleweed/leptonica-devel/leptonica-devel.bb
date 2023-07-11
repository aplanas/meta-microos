SUMMARY = "Leptonica Development Files"
DESCRIPTION = "Development files for the Leptonica library."
LICENSE = "BSD-2-Clause"

PV = "1.83.1"

RPM_NAME = "leptonica-devel-1.83.1-1.4.aarch64.rpm"
RPM_HASH = "629b85a71c9bad84bc51e5348b5b73f26adcce46fac4235ba7f911ea9090b90c95927945c92ee354131a3ff0d4e8f804ea85f10794905ebf9a76e7c46ec8e7d0"

RPROVIDES:${PN} += "leptonica-devel \
liblept-devel \
libleptonica-devel \
pkgconfig-lept"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libleptonica6"

inherit rpm
