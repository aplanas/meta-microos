SUMMARY = "Development files for the Python3 bindings for the LDB library"
DESCRIPTION = "This package contains the development files for the Python bindings for the \
LDB library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "python3-ldb-devel-2.7.2-1.2.aarch64.rpm"
RPM_HASH = "a9d4b358c136bf6250a9795263bbeab45914520c170e5723e29f65fb0fbcf4becc9fd12c8cead5a89f9df97ebfdc520cfda02d5874494886284bd1b59b7d50e9"

RPROVIDES:${PN} += "pkgconfig-pyldb-util.cpython-311-aarch64-linux-gnu \
python3-ldb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkg-config \
pkgconfig-ldb \
python3-ldb"

inherit rpm
