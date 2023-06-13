SUMMARY = "A collection of multi-dimensional data structure and indexing algorithm"
DESCRIPTION = "This library provides a collection of multi-dimensional data structure and indexing \
algorithms.  All data structures are available as C++ templates, hence this is a \
header-only library, with no shared library to link against."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "mdds-2_0-devel-2.0.3-1.2.noarch.rpm"
RPM_HASH = "78ee9098ff26ec0d8d3e9932f44b91ca5d02ebe6478cb88c476270da77cdbab6e239fc31ef0db95e155fcceb45e1ea0f7076f430f12ae12b265c9152f6a03206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mdds-2_0-devel \
pkgconfig(mdds-2.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost_headers-devel"

inherit rpm
