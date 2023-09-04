SUMMARY = "Development files for libcloudproviders"
DESCRIPTION = "The libcloudproviders-devel package contains libraries and header files for \
developing applications that use libcloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "libcloudproviders-devel-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "47312c44500759612899398bcfddf0a73743c47393d92e758171e2ce565145707e3ee9226d877b2195bfea465805481268c755f65958910b4b2cfd2b37741822"

RPROVIDES:${PN} += "libcloudproviders-devel \
pkgconfig-cloudproviders"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcloudproviders0"

inherit rpm
