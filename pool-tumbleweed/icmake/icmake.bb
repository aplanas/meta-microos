SUMMARY = "A program maintenance (make) utility using a C-like grammar"
DESCRIPTION = "Icmake allows the programmer to use a program language (closely \
resembling the well-known C-programming language) to define the \
actions involved in (complex) program maintenance. For this, icmake \
offers various special operators as well as a set of support functions \
that have proven to be useful in program maintenance."
LICENSE = "GPL-3.0-only"

PV = "10.03.00"

RPM_NAME = "icmake-10.03.00-3.4.aarch64.rpm"
RPM_HASH = "1390027cfcbdfcfa49e341fa9c140b2dfa5b41cd8d063d3fbf22485175fd31420697f91782032998e839dd6839ce91deb3f43359679b3d5acdfbf9ca55e2c34c"

RPROVIDES:${PN} += "config-icmake \
icmake"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
