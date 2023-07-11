SUMMARY = "Development files for libfmapi, a library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmapi."
LICENSE = "LGPL-3.0-or-later"

PV = "20230408"

RPM_NAME = "libfmapi-devel-20230408-1.3.aarch64.rpm"
RPM_HASH = "23cc3bcb1cb4317e85f612f01dfa3e3f5168e962b05eaba9696abaf63eea22fb866b1f7cc2932e99a697eac06759a41612cbad783b3fc66fb37f939a62565ae5"

RPROVIDES:${PN} += "libfmapi-devel \
pkgconfig-libfmapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmapi1"

inherit rpm
