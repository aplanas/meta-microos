SUMMARY = "Development files for dino"
DESCRIPTION = "Contains libraries and header files for developing plugins for dino."
LICENSE = "GPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "dino-devel-0.4.2-1.3.aarch64.rpm"
RPM_HASH = "052fe5d8b653a733d63f9c03e33068ebf68bc4d94c3f786dc4c1a00919059a135f2c0ddff1b419fb2d3ee2efbd1d3c6e6c16fe153f637271c5775b6552526045"

RPROVIDES:${PN} += "dino-devel"

RDEPENDS:${PN} += "dino"

inherit rpm
