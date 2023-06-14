SUMMARY = "Algorithm to find the maximum clique in a graph"
DESCRIPTION = "MaxCliqueDyn is an exact algorithm for finding a maximum clique in an undirected graph."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "mcqd-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "eab9060234035318c77745c731af85b64b197973ad17085ae8409bc9b4ee61ba6f7a18eec9c78f41f0b0e54b19c921eeb084ed985d9696caf27a75fe85adca72"

RPROVIDES:${PN} += "mcqd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
