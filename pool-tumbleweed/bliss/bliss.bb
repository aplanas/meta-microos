SUMMARY = "A Tool for Computing Automorphism Groups and Canonical Labelings of Graphs"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs. It has both a command line user interface as well as C++ \
and C programming language APIs."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "bliss-0.77-1.9.aarch64.rpm"
RPM_HASH = "fa666a24a959f0600873d137c8e87942c788c7269f246439e31c89a556664d71124d1dedcfb57df00a9446d75f5abb77334d4d01e4eb864d106a7e3ed063cddf"

RPROVIDES:${PN} += "bliss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbliss.so.0.77 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
