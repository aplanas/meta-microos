SUMMARY = "Development libraries for libblosc1"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc1."
LICENSE = "MIT & BSD-3-Clause & BSD-2-Clause"

PV = "1.21.1"

RPM_NAME = "blosc-devel-1.21.1-1.11.aarch64.rpm"
RPM_HASH = "51bd639358e4ee2f3331279a7389afceb299b27e73e5d9b4c1d2c11b471ea6fa7e4ec985c9c8d9fb59a907ba37de0c23d62ed105ce9a7958821ceb82936975e6"

RPROVIDES:${PN} += "blosc-devel \
pkgconfig-blosc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc1"

inherit rpm
