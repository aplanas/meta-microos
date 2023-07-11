SUMMARY = "Development files for libftxr"
DESCRIPTION = "libftxr is a library for Transactional Registry (TxR) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libftxr."
LICENSE = "LGPL-3.0-or-later"

PV = "20220118"

RPM_NAME = "libftxr-devel-20220118-3.3.aarch64.rpm"
RPM_HASH = "ae0c5c6bb34e081cd684b0247790e83ce6ba6d4619fe83acfbfcec4779d4153f2a00f2d541d7d91f388f5cef5abe3891bf3028ad6f4153498a7cd554f458d6a7"

RPROVIDES:${PN} += "libftxr-devel \
pkgconfig-libftxr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxr1"

inherit rpm
