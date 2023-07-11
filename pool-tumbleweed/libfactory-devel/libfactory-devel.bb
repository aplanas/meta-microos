SUMMARY = "Development files for Singular's factorization library"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. Factory handles \
sparse multivariate polynomials over different coefficient domains, \
such as Z, Q and GF(q), as well as algebraic extensions over Q and \
GF(q) in an efficient way. Factory includes algorithms for computing \
univariate and multivariate gcds, resultants, chinese remainders, and \
several algorithms to factorize univariate polynomials over the \
integers and over finite fields. \
 \
This package contains the include and library files."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libfactory-devel-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "3653b690a0f2a430291604ae57dde25047560063dbdf8ef24fdcef8d597966ce5c0d7b7d9a2f79f59dfcf601714a2c73547fa0d0dbe1158de2837b3f6bd38837"

RPROVIDES:${PN} += "libfactory-devel \
pkgconfig-factory"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfactory-4-3-1 \
pkgconfig-omalloc \
pkgconfig-singular-resources"

inherit rpm
