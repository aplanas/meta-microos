SUMMARY = "Header files for Symmetrica, a library for group theory"
DESCRIPTION = "Symmetrica is a C library with routines for group theory. \
This package contains header files."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "symmetrica-devel-3.0.1-1.12.aarch64.rpm"
RPM_HASH = "0a8d4184f93d65c85ee669f90da7d18d0cca34bc3cd2ec4eedb754b675a84943c4acd006e5e4b59509c78a1280337ba5cc3a96a9cd54c02057fac499c03a9010"

RPROVIDES:${PN} += "symmetrica-devel"

RDEPENDS:${PN} += "libsymmetrica2"

inherit rpm
