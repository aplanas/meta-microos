SUMMARY = "The bzip2 runtime library development files"
DESCRIPTION = "The bzip2 runtime library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libbz2-devel-1.0.8-5.3.aarch64.rpm"
RPM_HASH = "69732a7dca68a6a3405cbb9c79e5240b401f22d07130da1b211fabe580dd394915eec858a50dc8fe1f9bb3782c7876fa481954dcf96b57f2cae3cdf722c15d4c"

RPROVIDES:${PN} += "libbz2-devel \
pkgconfig-bzip2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libbz2-1"

inherit rpm
