SUMMARY = "Development and header files for Ipopt"
DESCRIPTION = "This package contains the development and header files for Ipopt."
LICENSE = "EPL-2.0"

PV = "3.14.12"

RPM_NAME = "Ipopt-devel-3.14.12-1.1.aarch64.rpm"
RPM_HASH = "67ff4d3999431476cef665e64f1aaaa47844d869a0f4eb698384694158989c5cf8d0d56c94d3202de75155daa21ee43532a3f0969cc16753d8cd63425359a728"

RPROVIDES:${PN} += "Ipopt-devel \
ipopt-devel \
pkgconfig-ipopt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipopt3 \
mumps-devel"

inherit rpm
