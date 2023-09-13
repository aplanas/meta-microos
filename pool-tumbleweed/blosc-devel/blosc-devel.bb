SUMMARY = "Development libraries for libblosc1"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc1."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "1.21.5"

RPM_NAME = "blosc-devel-1.21.5-1.1.aarch64.rpm"
RPM_HASH = "f70c45d186b2f07bd743f2fb446999e5c156ace7a05e019954897b214fe2f86c7463230cfa9518bb27f1c144edb78cb02ffd8c0a9c9422a895693a1dfed99161"

RPROVIDES:${PN} += "blosc-devel \
pkgconfig-blosc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc1"

inherit rpm
