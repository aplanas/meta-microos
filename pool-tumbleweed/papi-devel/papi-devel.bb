SUMMARY = "Software Development Kit for PAPI"
DESCRIPTION = "This package includes the C header files that specify the PAPI userspace \
libraries and interfaces. This is required for rebuilding any program \
that uses PAPI."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-devel-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "f56ae2860521e1a95ed61fd92d58885bf79c064905888bfaca855851f225a0cfe0c2dab40b42f44fb1c566dd99cde90053cb2ac82da1a5bad7279971a8652a88"

RPROVIDES:${PN} += "papi-devel \
pkgconfig-papi \
pkgconfig-papi-7.0 \
pkgconfig-papi-7.0.0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpapi \
linux-kernel-headers \
papi"

inherit rpm
