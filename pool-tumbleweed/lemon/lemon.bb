SUMMARY = "Library of Efficient Models and Optimization in Networks"
DESCRIPTION = "LEMON stands for Library for Efficient Modeling and Optimization in \
Networks.  It is a C++ template library providing efficient \
implementations of common data structures and algorithms with focus on \
combinatorial optimization tasks connected mainly with graphs and \
networks. \
 \
LEMON is a member of the COIN-OR initiative, a collection of OR related \
open source projects. You are free to use it in your commercial or \
non-commercial applications under very permissive license terms. \
 \
The project was launched by the Egerváry Research Group on Combinatorial \
Optimization (EGRES) at the Operations Research Department of the Eötvös \
Loránd University, Budapest in 2003. Up to this point, the developers of \
the library work at the Eötvös Loránd University, Budapest and at the \
Budapest University of Technology and Economics."
LICENSE = "BSL-1.0"

PV = "1.3.1"

RPM_NAME = "lemon-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "223ee904a8a0a6e72046915bf772c925f49ee718faaf8753ba1738e6c9fd8df0d7d21adaacc9148ff642ec9c5d870685e2d0857afd55d30e1fe60fab2e345035"

RPROVIDES:${PN} += "lemon"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libemon.so.1.3.1 \
libemon1-3-1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
