SUMMARY = "Development files for nlopt"
DESCRIPTION = "The nlopt-devel package contains libraries and header files for \
developing applications that use NLopt."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "nlopt-devel-2.7.1-3.8.aarch64.rpm"
RPM_HASH = "4aad48ae6d8f5f6b235974a3e46f50c70a62938af64bc72a47b5353392dec323aa928fa7657429a707f24624e4d63b62844c0a75309df3add7d2bd092521dce9"

RPROVIDES:${PN} += "cmake-NLopt \
nlopt-devel \
pkgconfig-nlopt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnlopt0"

inherit rpm
