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
cln(aarch-64) \
libcln \
libcln.so.6()(64bit) \
pi"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
