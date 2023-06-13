SUMMARY = "A collection of multi-dimensional data structure and indexing algorithm"
DESCRIPTION = "This library provides a collection of multi-dimensional data structure and indexing \
algorithms.  All data structures are available as C++ templates, hence this is a \
header-only library, with no shared library to link against."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "mdds-1_5-devel-1.6.0-2.6.noarch.rpm"
RPM_HASH = "89d0a88ac975504bc1dfd1a64254ee96df3807ec64193a090704ef1d887ba1b668234a77698238fb54f33424f04639020add5922309f7827bc5b01afdf9e582b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mdds-1_5-devel \
pkgconfig(mdds-1.5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost_headers-devel"

inherit rpm
