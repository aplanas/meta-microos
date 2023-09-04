SUMMARY = "Development libraries for libblosc1"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc1."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "1.21.4"

RPM_NAME = "blosc-devel-1.21.4-1.1.aarch64.rpm"
RPM_HASH = "826a6a8d4c7d3eaef50c962ff0e70307ebc111f5565eefe09e485affcab8e0cf4827d2f35f30fd0029bd7372723927fe52e529c4a5459253f2965834d3b9ede3"

RPROVIDES:${PN} += "blosc-devel \
pkgconfig-blosc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc1"

inherit rpm
