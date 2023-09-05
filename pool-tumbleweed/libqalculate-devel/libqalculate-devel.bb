SUMMARY = "Header files, libraries and development documentation for libqalculate"
DESCRIPTION = "This package contains the header files and development \
documentation for libqalculate. If you like to develop programs using libqalculate, \
you will need to install libqalculate-devel."
LICENSE = "GPL-2.0-or-later"

PV = "4.8.0"

RPM_NAME = "libqalculate-devel-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "0a06b38d7f4055142c8035c7c2d31153d92cc9026bc873cbf5db58018a3f554deb5aeff10f691af0410fa8ef2142eea7b74eec68175a57c0edfec044c6172533"

RPROVIDES:${PN} += "libqalculate-devel \
pkgconfig-libqalculate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
libqalculate \
pkgconfig-libxml-2.0 \
pkgconfig-mpfr"

inherit rpm
