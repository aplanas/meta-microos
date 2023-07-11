SUMMARY = "HDHomeRun library"
DESCRIPTION = "Development libraries needed to build applications with libhdhomerun."
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "libhdhomerun-devel-20190621-1.19.aarch64.rpm"
RPM_HASH = "afd7dff0d24fa33cf4432ea0caa4d0bccc4cecfd7d2e0333c7ecb428c29f69dcbd1c5b91a00c980d49ae7368c4fbf605b2355f161c0843181b1200188c64def2"

RPROVIDES:${PN} += "libhdhomerun-/usr/include/libhdhomerun/hdhomerun.h \
libhdhomerun-devel"

RDEPENDS:${PN} += "libhdhomerun2"

inherit rpm
