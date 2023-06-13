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

RPM_NAME = "lemon-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "8c748e2e9a7ca04ce4d081bb738e6461108bb675a974a96e41a73edfa65bbe58bf841157e963625083899310ee317eb21095ddb16d5425d478ce5743b3931f79"

RPROVIDES:${PN} += "lemon \
lemon(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libemon.so.1.3.1()(64bit) \
libemon1_3_1 \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
