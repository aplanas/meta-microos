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

RPM_NAME = "dunelegacy-0.96.4-3.26.aarch64.rpm"
RPM_HASH = "a856739f0e9f956e70ad94556447540326875b6da234f275f8902adbe403d3b251aea4e8b62f061b5a7c57e346f12b71bd504b37eee9793e5e5db013c502d878"

RPROVIDES:${PN} += "dunelegacy"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
