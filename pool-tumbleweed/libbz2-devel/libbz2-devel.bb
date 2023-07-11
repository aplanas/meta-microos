SUMMARY = "The bzip2 runtime library development files"
DESCRIPTION = "The bzip2 runtime library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libbz2-devel-1.0.8-5.5.aarch64.rpm"
RPM_HASH = "8dc938b877f2bfb80919e278c05dadd5c209c021d377d8b066cdb4437b7883d27ae7dab26bf6e4853fa4969a120f04b4fb25ab77f36ba29c552989fd174da03c"

RPROVIDES:${PN} += "libbz2-devel \
pkgconfig-bzip2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libbz2-1"

inherit rpm
