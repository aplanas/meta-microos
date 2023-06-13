SUMMARY = "Development files for the static gflags library"
DESCRIPTION = "This package contains all necessary include files and the static libraries \
needed for developing applications."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-devel-static-2.2.2-3.1.aarch64.rpm"
RPM_HASH = "d7599e5b6a12ca6881e6991780cf31e3f50c4e418dbb671d5035ae1be6cd2941fc77eb359f226823761ebb497b52c2bd30df41254cfa3060f6fb3e224c6f8c5d"

RPROVIDES:${PN} += "cmake(gflags) \
gflags-devel-static \
gflags-devel-static(aarch-64) \
pkgconfig(gflags_static)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
