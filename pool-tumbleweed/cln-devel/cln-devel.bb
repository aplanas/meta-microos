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

RPM_NAME = "cln-devel-1.3.6-2.12.aarch64.rpm"
RPM_HASH = "001c6e4eb76af690ff31b3c47a126873206c756b66195d0f637af4c23f11da5ed6bad2238b6855295068a70704bcd442e5356d6ffcf79d3d98300ae6ded6d6ff"

RPROVIDES:${PN} += "cln-devel \
pkgconfig-cln"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
cln"

inherit rpm
