SUMMARY = "Development files for libdispatch"
DESCRIPTION = "The libdispatch-devel package contains libraries and header files for \
developing applications that use libdispatch."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "libdispatch-devel-5.6.3-1.2.noarch.rpm"
RPM_HASH = "bcee0487091d203640e0c22eca69713154f28398ed26bcee54ff92824e75dc9ea07dc7a27db9d227975b301e68e6261906d3573ab36f89e93a6a3c327f4c1f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdispatch-devel"

RDEPENDS:${PN} += "libdispatch1_3"

inherit rpm
