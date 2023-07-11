SUMMARY = "CBLAS development files"
DESCRIPTION = "cblas headers and development files."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "cblas-devel-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "7e6e98b19369dcbb3d41b750c79b5697b34ba839ed6afe45550352b0b04f1fa09c6a3d46b995d7ce482eb8f95ffe5335e879babb88a09f6433cc72639825748a"

RPROVIDES:${PN} += "cblas \
cblas-devel"

RDEPENDS:${PN} += "libcblas3"

inherit rpm
