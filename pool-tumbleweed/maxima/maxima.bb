SUMMARY = "Symbolic Computation Program/Computer Algebra System"
DESCRIPTION = "Maxima is a full symbolic computation program.  It is full featured \
doing symbolic manipulation of polynomials, matrices, rational \
functions, integration, Todd-coxeter, graphing, bigfloats.  It has a \
symbolic debugger source level debugger for maxima code.  Maxima is \
based on the original Macsyma developed at MIT in the 1970's.  It is \
quite reliable, and has good garbage collection, and no memory leaks. \
It comes with hundreds of self tests."
LICENSE = "GPL-2.0-or-later"

PV = "5.47.0"

RPM_NAME = "maxima-5.47.0-1.3.aarch64.rpm"
RPM_HASH = "0b5d3450ff273b6d433905caa4460bd93e0f44a2c8e9810930a85c8c6d6e6f5eef2a5a4590ae1d80a2df95e97230ea03888c0065176016d6c378bd5559016454"

RPROVIDES:${PN} += "maxima"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot \
maxima-exec \
plotutils \
rlwrap"

inherit rpm
