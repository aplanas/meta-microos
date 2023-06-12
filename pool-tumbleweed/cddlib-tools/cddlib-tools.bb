SUMMARY = "Programs for vertex generation using Double Description Method"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities. \
 \
This package contains the command-line utilities of cddlib."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "cddlib-tools-0.94m-1.10.aarch64.rpm"
RPM_HASH = "cf4bfaba3df7c3a68ced29fe5c45fbc56a70f99116a5c09c13120ab1f8269bbd1db2e1a1aa8a8da975391ac0530f5476a632535ecb2344e74e9e8134643aaba6"

RPROVIDES:${PN} += "cddlib-devel:/usr/bin/scdd \
cddlib-tools \
cddlib-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdd.so.0()(64bit) \
libcddgmp.so.0()(64bit) \
libgmp.so.10()(64bit)"

inherit rpm
