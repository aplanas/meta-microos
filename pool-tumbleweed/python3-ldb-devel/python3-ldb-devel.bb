SUMMARY = "Development files for the Python3 bindings for the LDB library"
DESCRIPTION = "This package contains the development files for the Python bindings for the \
LDB library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "python3-ldb-devel-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "4b31cb3895485501f305c05c88520f2ab5f1f86ff9302730ef271de6d143add3b02dd46e639a7f454e60a8e9a4aad86ffeecf2eeb36e80b98865fa2f70a948eb"

RPROVIDES:${PN} += "pkgconfig-pyldb-util.cpython-310-aarch64-linux-gnu \
python3-ldb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconf-pkg-config \
pkgconfig-ldb \
python3-ldb"

inherit rpm
