SUMMARY = "Development files for OpenSM"
DESCRIPTION = "Symlinks for the dynamic libraries and header files for OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "opensm-devel-3.3.24-3.8.aarch64.rpm"
RPM_HASH = "a1633bf67f96139c37d186b2e3999f82c90dd9eca479b0358702d390a5f611b5867d81bce0f8c0d67298413a56f72ba1fe8a5e5af42896cdf41f2540084e3e0b"

RPROVIDES:${PN} += "opensm-devel"

RDEPENDS:${PN} += "libibumad-devel \
libopensm9 \
libosmcomp5 \
libosmvendor5"

inherit rpm
