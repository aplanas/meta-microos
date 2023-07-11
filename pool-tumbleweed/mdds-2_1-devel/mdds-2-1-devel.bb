SUMMARY = "A collection of multi-dimensional data structure and indexing algorithm"
DESCRIPTION = "This library provides a collection of multi-dimensional data structure and indexing \
algorithms.  All data structures are available as C++ templates, hence this is a \
header-only library, with no shared library to link against."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "mdds-2_1-devel-2.1.0-1.1.noarch.rpm"
RPM_HASH = "be6a26733ec266dca60ec6a69f4edfbc41cd49293d47d9d17a77b4db1a6cf4cb86c80f7c213dacd79a09e0adc3df79993ace9a33189f4b2d490a8a76764c7254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mdds-2-1-devel \
pkgconfig-mdds-2.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel"

inherit rpm
