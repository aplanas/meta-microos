SUMMARY = "Class Library for Numbers (C++)"
DESCRIPTION = "CLN features a rich set of number classes: integer (unlimited \
precision), rational, short float, single float, double float, long \
float (unlimited precision), complex, modular integer, and univariate \
polynomial.  It implements elementary, logical, and transcendental \
functions.  C++ as the implementation language brings efficiency, type \
safety, and algebraic syntax.  Memory efficiency: small integers and \
short floats are immediate, not heap allocated. Automatic, \
noninterruptive garbage collection.  Speed efficiency: assembly \
language kernel for some CPUs, Karatsuba and Schoenhage-Strassen \
multiplication.  Interoperability: garbage collection with no burden on \
the main application, hooks for memory allocation and exceptions. \
 \
The following C++ features are used: classes, member functions, \
overloading of functions and operators, constructors and destructors, \
inline, const, multiple inheritance, templates, and namespaces.  The \
following C++ features are not used: new, delete, virtual inheritance, \
and exceptions."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "cln-devel-1.3.6-2.13.aarch64.rpm"
RPM_HASH = "52dd252d1b4f2db958fcbc249b71c1ea7a47e3bfe52fb1067249b1bd6dcf30c6e7564d1e30a0b8fe8b3dea56c20537f98275af216915f2b59d551b2d834c3fec"

RPROVIDES:${PN} += "cln-devel \
pkgconfig-cln"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
cln"

inherit rpm
