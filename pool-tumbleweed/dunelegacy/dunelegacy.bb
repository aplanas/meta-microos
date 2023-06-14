SUMMARY = "A modern Dune II reimplementation"
DESCRIPTION = "Lead one of three interplanetary houses, Atreides, Harkonnen or Ordos, \
in an attempt to harvest the largest amount of spice from the sand \
dunes. Exchange your spice stockpiles for credits through refinement \
and build an army capable of thwarting attempts of the other houses to \
stop your harvesting! \
 \
Dune Legacy is an effort by a handful of developers to revitalize the \
first-ever real-time strategy game. The original game was the basis \
for the hugely successful Command and Conquer series, and the gameplay \
has been replicated an extended to a wide variety of storylines and \
series. \
 \
NOTE: Original Dune 2 game files are needed."
LICENSE = "GPL-2.0+"

PV = "0.96.4"

RPM_NAME = "dunelegacy-0.96.4-3.25.aarch64.rpm"
RPM_HASH = "7ce37fe3bce1bd179e4800602b74dd54238a6eb68d12f47d8389d5c32b1129430c77c1d6049e4998a0056c3e8d0b7f1ecb301661ecba7cec332f61bd2c1512d1"

RPROVIDES:${PN} += "dunelegacy"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
