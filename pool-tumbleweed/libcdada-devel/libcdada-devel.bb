SUMMARY = "Development files for libcdada"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libcdada."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "libcdada-devel-0.4.0-1.7.aarch64.rpm"
RPM_HASH = "fcd0bd2d43380ffc6891c64fe069f92d8cc1e950b6ed1300a26e6abeeb65bcbcd5c276296e8a4f3a27fb132cfd500c3a6275bd2528f3c8e10f0ff4cb28c61b58"

RPROVIDES:${PN} += "libcdada-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
libcdada0 \
python3"

inherit rpm
