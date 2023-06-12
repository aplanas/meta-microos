SUMMARY = "Development files of molequeue"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-devel-0.9.0-3.9.aarch64.rpm"
RPM_HASH = "1c12a1a0d5a5869870e5caac0350255fc9fb6ed6ecc9a58b0b2ed1d45fc9c7e0b6019cd5cfcb70f5c4e06e20cf9b9d0b5d8f8ad251572d6ecffbe3340b489ba8"

RPROVIDES:${PN} += "cmake(MoleQueue) \
molequeue-devel \
molequeue-devel(aarch-64)"
RDEPENDS:${PN} += "libqt5-qtbase-devel \
molequeue-libs0(aarch-64)"

inherit rpm
