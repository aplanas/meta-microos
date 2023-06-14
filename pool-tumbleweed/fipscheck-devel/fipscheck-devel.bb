SUMMARY = "Development files for fipscheck"
DESCRIPTION = "This package contains development files for fipscheck."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "fipscheck-devel-1.7.0-1.4.aarch64.rpm"
RPM_HASH = "47cac9088373b0e645cea95c1e5fb13c1c34c99ab826d48dcb4696340d8a4141a4ed9a3136ec44582653c3cad8d0040e728ede51f6d5599a1b1f9c084fa99662"

RPROVIDES:${PN} += "fipscheck-devel"

RDEPENDS:${PN} += "libfipscheck1"

inherit rpm
