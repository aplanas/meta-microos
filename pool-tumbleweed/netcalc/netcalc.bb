SUMMARY = "IP subnet calculator"
DESCRIPTION = "netcalc is an IP network calculator that can calcuate host IP ranges, subnet \
masks, and split networks. It is a clone of sipcalc and uses the output format \
of ipcalc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "netcalc-2.1.6-2.9.aarch64.rpm"
RPM_HASH = "473d2851c4289a92f1bd21e5ef91fb269c35abf2460aa0b299489891cf6a332febcb0160db5ccc7c601e78f06cfca263d203579dbddd4b0622c3ac06254f53f9"

RPROVIDES:${PN} += "netcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
