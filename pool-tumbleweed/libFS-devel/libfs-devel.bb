SUMMARY = "Development files for the X Font Service client library"
DESCRIPTION = "This library is used by clients of X Font Servers (xfs), such as \
xfsinfo, xfslsfonts, and the X servers themselves. \
 \
This package contains the development headers for the library found \
in libFS6."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libFS-devel-1.0.9-1.2.aarch64.rpm"
RPM_HASH = "ae88d938e96d3eb05e0c540f066d274438c4a92632a673de44356936cd7fca73c41f3b24ff7d41341664bdf3fdd425b66c4fb9db68e6b0a513d146cc3570269b"

RPROVIDES:${PN} += "libFS-devel \
pkgconfig-libfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFS6 \
pkgconfig-fontsproto \
pkgconfig-xproto"

inherit rpm
