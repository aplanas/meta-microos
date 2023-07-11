SUMMARY = "Development files for the libcomps library"
DESCRIPTION = "This package provides the development files for libcomps."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "libcomps-devel-0.1.19-2.4.aarch64.rpm"
RPM_HASH = "206025ac8dc25133008f86a4f69815188017c18195260d81d3954f02786435227ca8d2c83917d0c36cac24af0391149da57038d9d629a5b611b4db0684748e46"

RPROVIDES:${PN} += "libcomps-devel \
pkgconfig-libcomps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcomps0 \
pkgconfig \
pkgconfig-expat \
pkgconfig-libxml-2.0"

inherit rpm
