SUMMARY = "Development files for dataquay, an RDF data store library"
DESCRIPTION = "Dataquay is a library that provides a C++ API for an \
RDF data store using Qt5 classes and containers. \
 \
This subpackage contains the header files for developing \
applications that want to make use of dataquay."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "dataquay-devel-0.9.1-2.23.aarch64.rpm"
RPM_HASH = "0a35133e097f99ad68baa6da343fae8e1d2c4f1cdb0999725ab4fddbfcf8e831f60d2cf17d47a0b6750657295b891e567e8a0a85b61bb3065d9a21191d70fc6a"

RPROVIDES:${PN} += "dataquay-devel \
pkgconfig-dataquay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdataquay0"

inherit rpm
