SUMMARY = "Development files for HackRF"
DESCRIPTION = "Library headers for the hackrf driver."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-devel-2023.01.1-1.2.aarch64.rpm"
RPM_HASH = "a7798454b02ca765aa8d3cedbeda2da91ce2cb5ad97238499529c2889b9ae55fb69a6cf306ecc48634e2ea106827adf87d002a49c834e15fc15c7ab2c634ea22"

RPROVIDES:${PN} += "hackrf-devel \
hackrf-devel(aarch-64) \
pkgconfig(libhackrf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhackrf0"

inherit rpm
