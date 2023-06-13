SUMMARY = "Symbolic Computation Program/Computer Algebra System"
DESCRIPTION = "Maxima is a full symbolic computation program.  It is full featured \
doing symbolic manipulation of polynomials, matrices, rational \
functions, integration, Todd-coxeter, graphing, bigfloats.  It has a \
symbolic debugger source level debugger for maxima code.  Maxima is \
based on the original Macsyma developed at MIT in the 1970's.  It is \
quite reliable, and has good garbage collection, and no memory leaks. \
It comes with hundreds of self tests."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-5.46.0-1.20.aarch64.rpm"
RPM_HASH = "c060fe2142e651e4adb24cb6f25fa531dfc5fbb1318c6714dfe8fe5cacab9ee3db9fac80adca183487e6106549dfd891123cd27a35d3e7e803d5d9ef1c1521d4"

RPROVIDES:${PN} += "maxima \
maxima(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnuplot \
maxima_exec \
plotutils \
rlwrap"

inherit rpm
