SUMMARY = "Development files for libcloudproviders"
DESCRIPTION = "The libcloudproviders-devel package contains libraries and header files for \
developing applications that use libcloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libcloudproviders-devel-0.3.1-3.4.aarch64.rpm"
RPM_HASH = "feed8f2028ea24a8a2b7e410d9f4af3d2f0cddc0a47d0fc21531fe27f95e341e8a9a247abaf780415fa255cc99773394abc4ee903abe685f205071070c20388c"

RPROVIDES:${PN} += "libcloudproviders-devel \
pkgconfig-cloudproviders"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcloudproviders0"

inherit rpm
