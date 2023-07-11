SUMMARY = "Development files for librtprocess"
DESCRIPTION = "This is a project that aims to make some of RawTherapee's highly optimized raw \
processing routines readily available for other FOSS photo editing software. \
 \
This package holds the development files."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "0.12.0+20211228"

RPM_NAME = "librtprocess-devel-0.12.0+20211228-1.7.aarch64.rpm"
RPM_HASH = "168ae8d40a01b278889a1b6848dd862f2592ffb3c2eb4e7bc2f4a0bcf18570aa066466c88afb942e5cfacfcf7be53922bc6b76e656d559d70fe8a6bdb722db3e"

RPROVIDES:${PN} += "cmake-rtprocess \
librtprocess-devel \
pkgconfig-rtprocess"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librtprocess0"

inherit rpm
