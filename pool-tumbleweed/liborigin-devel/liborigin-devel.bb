SUMMARY = "Libraries and header files for liborigin"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that read OriginLab OPJ project files."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin-devel-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "8f0a716fdb76ce178163b5d459b30fd23fc0237e9ff855d2096fbd03dd23ebaee78dad3f4b88d0db97f16de2f804ac91b07247796d0f60445b43b63ff49902dc"

RPROVIDES:${PN} += "liborigin-devel \
liborigin-devel(aarch-64) \
pkgconfig(liborigin)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborigin3"

inherit rpm
