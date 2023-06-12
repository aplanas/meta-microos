SUMMARY = "Development files for libimobiledevice-glue"
DESCRIPTION = "The libimobiledevice-glue-devel package contains libraries and header files for \
developing applications that use libimobiledevice-glue."
LICENSE = "LGPL-2.1-or-later"

PV = "0~git.20210925"

RPM_NAME = "libimobiledevice-glue-devel-0~git.20210925-1.7.aarch64.rpm"
RPM_HASH = "dff6fcd572819399895fc8ed3eccf7da13d19cffe4d5e42d665fa4cd8dfda9de0f54f205195bf7d789625b6117e1fc2717d047bef93d54f964ed937a6fd90c43"

RPROVIDES:${PN} += "libimobiledevice-glue-devel \
libimobiledevice-glue-devel(aarch-64) \
pkgconfig(libimobiledevice-glue-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimobiledevice-glue-1_0-0 \
pkgconfig(libplist-2.0)"

inherit rpm
