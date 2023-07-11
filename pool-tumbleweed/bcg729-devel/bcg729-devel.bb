SUMMARY = "Development files for libbcg729"
DESCRIPTION = "This package includes the files necessary for compiling and linking \
application which will use libbcg729."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "bcg729-devel-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "01465c915b0c7728adafaa40cc75b804de9ddeb998988cbb41f5137feacdc4a6488e6913d5dcec7d78c63036e709a58ca94365c39deb924f8da16d5426ef7d8c"

RPROVIDES:${PN} += "bcg729-devel \
pkgconfig-libbcg729"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcg729-0"

inherit rpm
