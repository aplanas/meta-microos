SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-freescale-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "aed8cceb9092504df9ae0de615b0bc3a12d3211888f1a328259b6201cd55f471a9a712242186aa297c7a0ad42ca2dc81b5fa9eb6e17e9f53ce3fae2d5708009b"

RPROVIDES:${PN} += "dtb-freescale dtb-freescale(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
