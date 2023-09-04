SUMMARY = "A collection of multi-dimensional data structure and indexing algorithm"
DESCRIPTION = "This library provides a collection of multi-dimensional data structure and indexing \
algorithms.  All data structures are available as C++ templates, hence this is a \
header-only library, with no shared library to link against."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "mdds-2_1-devel-2.1.1-1.1.noarch.rpm"
RPM_HASH = "e855649b232972a42e2eacb066dbe838ea18cc550ddc48d35eead5574a481da06d0de6764d95377eca64bcdc2840b27314ee7e480af135280ea3e31e02456503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mdds-2-1-devel \
pkgconfig-mdds-2.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel"

inherit rpm
