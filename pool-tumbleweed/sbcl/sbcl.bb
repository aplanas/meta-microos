SUMMARY = "Steel Bank Common Lisp"
DESCRIPTION = "Steel Bank Common Lisp (SBCL) is a high performance Common Lisp \
compiler. It is open source / free software, with a permissive license. \
In addition to the compiler and runtime system for ANSI Common Lisp, it \
provides an interactive environment including a debugger, a statistical \
profiler, a code coverage tool, and many other extensions."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2.3.6"

RPM_NAME = "sbcl-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "9b0ba8333ca56b0673b3c36dc5febd6553de52395d2a34cd3b7a0b5bdfca25eb79eaf0ca8f4d89a0e50736e9bc6190a08748452103d0ef49bb82be82db33734e"

RPROVIDES:${PN} += "sbcl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzstd.so.1"

inherit rpm
