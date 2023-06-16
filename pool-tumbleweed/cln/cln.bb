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

RPM_NAME = "cln-1.3.6-2.12.aarch64.rpm"
RPM_HASH = "b3acd1e4811cbfb1684492ed2505d332bdeec005677728d5499ed47246c88d6edef4abfb82d9af325d719f360db36441f556b6b268c0dbeab10fe6a4d46d03a9"

RPROVIDES:${PN} += "cln \
libcln \
libcln.so.6 \
pi"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
