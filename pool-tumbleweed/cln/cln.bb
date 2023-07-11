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

RPM_NAME = "cln-1.3.6-2.13.aarch64.rpm"
RPM_HASH = "9080d4ebb3d0aa3fc8256638cef8fd8d2ad4b45231633a88d53896bf316cd05f3b5d58d548b5e0d9054b668f55a8fc56957682733a0f6a4584a3f832e7e999e8"

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
