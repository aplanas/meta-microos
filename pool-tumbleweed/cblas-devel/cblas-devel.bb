SUMMARY = "CBLAS development files"
DESCRIPTION = "cblas headers and development files."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "cblas-devel-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "8465638e64799022f428463bb4402cca25159553142d7a23528898e282b23b3bf9307a47b592dae589a8f8a637b8df49b9285600a24a3f9f138bb4b300c7d3c2"

RPROVIDES:${PN} += "cblas \
cblas-devel"

RDEPENDS:${PN} += "libcblas3"

inherit rpm
