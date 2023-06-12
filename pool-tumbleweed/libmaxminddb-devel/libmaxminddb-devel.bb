SUMMARY = "Development files for the MaxMind DB file format library"
DESCRIPTION = "The libmaxminddb library provides a C library for reading MaxMind DB \
files, including the GeoIP2 databases from MaxMind. This is a \
custom binary format designed to facilitate fast lookups of IP \
addresses while allowing for great flexibility in the type of \
data associated with an address. \
 \
This package contains the development files for libmaxminddb."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "libmaxminddb-devel-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "2e28bbe7840ddcc096a81a8c639e2f5bc8ab2782d87054a7d7f04e7c36e562d063a12f4b9fe7a27ab368c6aaaa6c7f7b13927d3bae5a32e7f5ba86dcb9a84395"

RPROVIDES:${PN} += "libmaxminddb-devel \
libmaxminddb-devel(aarch-64) \
pkgconfig(libmaxminddb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmaxminddb0"

inherit rpm
