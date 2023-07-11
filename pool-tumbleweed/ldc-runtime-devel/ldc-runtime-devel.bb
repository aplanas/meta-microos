SUMMARY = "Development files for the D runtime library"
DESCRIPTION = "This package contains the druntime development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-runtime-devel-1.32.0-1.2.aarch64.rpm"
RPM_HASH = "f50e514c7d03ce632176593783d807d75e21e817e7078048eb3dfa5abd01ca17a6a9e56da4c215f105fdb7f890d6003694531a9d29369e6c5d485378493c87ff"

RPROVIDES:${PN} += "ldc-runtime-devel"

RDEPENDS:${PN} += "libdruntime-ldc102"

inherit rpm
