SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-mips-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "34b695294e43862dd0ab3cb2ec8f0a438426c5107c0f7853150a7eae26fdaedfbe1e5768ab7668fbffbd181c66ea0e99bb967e9860edd3c65c4fce3c9d743a96"

RPROVIDES:${PN} += "cross-mips-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
