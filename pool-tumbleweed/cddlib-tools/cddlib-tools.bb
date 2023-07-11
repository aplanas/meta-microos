SUMMARY = "Programs for vertex generation using Double Description Method"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities. \
 \
This package contains the command-line utilities of cddlib."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "cddlib-tools-0.94m-1.11.aarch64.rpm"
RPM_HASH = "1c9fd3963485a4563d349548bd1e084c777eb1d0523effd1f0b66d425c110f3c7870ae7093484d4a2ffeb9426e6c6e66dacbba7011c781a9ea25b83298011da0"

RPROVIDES:${PN} += "cddlib-devel-/usr/bin/scdd \
cddlib-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdd.so.0 \
libcddgmp.so.0 \
libgmp.so.10"

inherit rpm
