SUMMARY = "Header files for Symmetrica, a library for group theory"
DESCRIPTION = "Symmetrica is a C library with routines for group theory. \
This package contains header files."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "symmetrica-devel-3.0.1-1.11.aarch64.rpm"
RPM_HASH = "c8ca3f5d770484009e34aa91bb589ba500551acfa1e532e5e29d594fddcfb17bf5257de7a2e943a1e0c65cfa7fd4e7b7522084c94d43d1ee1124b061747ca902"

RPROVIDES:${PN} += "symmetrica-devel \
symmetrica-devel(aarch-64)"

RDEPENDS:${PN} += "libsymmetrica2"

inherit rpm
