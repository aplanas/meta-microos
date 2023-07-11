SUMMARY = "Private headers for rime"
DESCRIPTION = "This package provides private headers of Rime to build plugins."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime-private-devel-1.7.3-2.19.aarch64.rpm"
RPM_HASH = "ea5440a6ddffcaf8c2ce175f3cc16906500400d0e9e23ea9482587c2bd0f33973d01c3ad9fe458ec28ee045e3ee2bf0ae58029488ce4007e81ad8867e3375d00"

RPROVIDES:${PN} += "librime-private-devel"

RDEPENDS:${PN} += "librime-devel"

inherit rpm
