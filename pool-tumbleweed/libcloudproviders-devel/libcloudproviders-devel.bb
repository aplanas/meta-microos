SUMMARY = "Development files for libcloudproviders"
DESCRIPTION = "The libcloudproviders-devel package contains libraries and header files for \
developing applications that use libcloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libcloudproviders-devel-0.3.1-3.3.aarch64.rpm"
RPM_HASH = "7f474a43f616eb43fab85746928e0a23b5b73326245084d970c439a179ab29790b381fe354833b3b93b6657e0598e526a76f59b75aa6a97ce29174e8d4b3c399"

RPROVIDES:${PN} += "libcloudproviders-devel \
libcloudproviders-devel(aarch-64) \
pkgconfig(cloudproviders)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcloudproviders0"

inherit rpm
