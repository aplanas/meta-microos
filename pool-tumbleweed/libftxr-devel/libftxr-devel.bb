SUMMARY = "Development files for libftxr"
DESCRIPTION = "libftxr is a library for Transactional Registry (TxR) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libftxr."
LICENSE = "LGPL-3.0-or-later"

PV = "20220118"

RPM_NAME = "libftxr-devel-20220118-3.2.aarch64.rpm"
RPM_HASH = "bdb3e52c296dc31de0b9be94424882940ee06c0db784d49d9270fedd1b1d841b6f02245be834b54b8c0687ae08c1fe685ed69c0902d2c1f76cca63cd95691995"

RPROVIDES:${PN} += "libftxr-devel \
pkgconfig-libftxr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxr1"

inherit rpm
