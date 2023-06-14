SUMMARY = "Header files for the libart 2D graphics library"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of libart_lgpl."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.21"

RPM_NAME = "libart_lgpl-devel-2.3.21-25.3.aarch64.rpm"
RPM_HASH = "3a78233ee2979a0fa59601bfd6b7f9bdf040bce9e9e88cad03e7348008e81664d0ed177f9f86a06c7726a7e4aabc221ee01bfeaabcbd6c9bab4c82eef4cc1c73"

RPROVIDES:${PN} += "libart-lgpl-devel \
pkgconfig-libart-2.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libart-lgpl-2-2"

inherit rpm
