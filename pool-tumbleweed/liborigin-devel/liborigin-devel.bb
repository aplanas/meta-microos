SUMMARY = "Libraries and header files for liborigin"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that read OriginLab OPJ project files."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "liborigin-devel-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "674fac249e1be48665b86a567d2fb8ee3d0de2901286725116a6de68d6b48a7c59a4161e43c44ecb699e7335ccc6743425402884837eb93ef0732353b7355fc4"

RPROVIDES:${PN} += "liborigin-devel \
pkgconfig-liborigin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborigin3"

inherit rpm
