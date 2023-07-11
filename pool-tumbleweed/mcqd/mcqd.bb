SUMMARY = "Algorithm to find the maximum clique in a graph"
DESCRIPTION = "MaxCliqueDyn is an exact algorithm for finding a maximum clique in an undirected graph."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "mcqd-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "9ab900c76ecd41c714720fbfe51c59d0ff85602093b5b22b93a8d5aa5896bd6d3c90d2bb60a1e092f9853cac20a8de6d2897cd6bb38bfcf25890ab41ea39829d"

RPROVIDES:${PN} += "mcqd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
