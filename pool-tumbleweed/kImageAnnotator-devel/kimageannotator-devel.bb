SUMMARY = "Development files for kImageAnnotator"
DESCRIPTION = "Development files for kImageAnnotator including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "kImageAnnotator-devel-0.6.1-1.2.aarch64.rpm"
RPM_HASH = "81ca5e909e61cb36f4e9e6b1b5bb3ea21c5d3a1e6496faab520d8d5bdff4cc22ef92b8fe62cd193ac06482dfab88454ae510e5ae6504264f0e3f0bf2c621ea86"

RPROVIDES:${PN} += "cmake-kImageAnnotator \
kImageAnnotator-devel"

RDEPENDS:${PN} += "libkImageAnnotator0"

inherit rpm
