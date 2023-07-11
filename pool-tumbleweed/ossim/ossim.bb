SUMMARY = "Open Source Software Image Map (OSSIM)"
DESCRIPTION = "The OSSIM core utilities. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "ossim-2.11.1-1.21.aarch64.rpm"
RPM_HASH = "8d444718102f185e15886162d1e6186e9f076cd835661c8044eb78110594c7d4452e41f0ea9dd37ce96e0f557c103e904d6034da1e0f838b72c97b345b1f3941"

RPROVIDES:${PN} += "ossim"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libossim.so.1 \
libstdc++.so.6"

inherit rpm
