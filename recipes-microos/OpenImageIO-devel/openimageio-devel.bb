SUMMARY = "Development Files for OpenImageIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.8.1"

RPM_NAME = "OpenImageIO-devel-2.4.8.1-1.5.aarch64.rpm"
RPM_HASH = "c3aa4dd5f870fa206795b5859052f50ad6f8989dce83f381186a8559c3cf76cce142267a9d36f3414a568c6c23918e7c82bdddad989591ba7457fd8a6103803e"

RPROVIDES:${PN} += "OpenImageIO-devel OpenImageIO-devel(aarch-64) cmake(OpenImageIO) pkgconfig(OpenImageIO)"
RDEPENDS:${PN} += "/usr/bin/pkg-config fmt-devel libOpenImageIO2_4 libOpenImageIO_Util2_4"

inherit rpm
