SUMMARY = "Development tools for dareader"
DESCRIPTION = "The dareader-devel package contains the header files for dareader."
LICENSE = "GPL-3.0+"

PV = "0.0.0+git20220726.2d7d79c"

RPM_NAME = "dareader-devel-0.0.0+git20220726.2d7d79c-2.3.aarch64.rpm"
RPM_HASH = "509e573489a35e87abd6f7c2ed564445ec1798cd7724da5b3b047d3b7d9280e97ca6b06e6d927eb7aae71a699e9d1f4ca71b0bc6f271ce13fed1a80719607d41"

RPROVIDES:${PN} += "dareader-devel \
pkgconfig-dareader"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdareader1"

inherit rpm
