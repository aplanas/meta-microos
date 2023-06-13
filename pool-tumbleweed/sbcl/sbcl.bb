SUMMARY = "Steel Bank Common Lisp"
DESCRIPTION = "Steel Bank Common Lisp (SBCL) is a high performance Common Lisp \
compiler. It is open source / free software, with a permissive license. \
In addition to the compiler and runtime system for ANSI Common Lisp, it \
provides an interactive environment including a debugger, a statistical \
profiler, a code coverage tool, and many other extensions."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2.3.5"

RPM_NAME = "sbcl-2.3.5-1.1.aarch64.rpm"
RPM_HASH = "8a2da630843f1dfaa1febb7803bdaf6a1d99dd1ab01dcf6cdf58a20d0f32536dcc8f12f175cf71e76e02f3ab28b3db96ff614ff626c279ab13f58e32651d760e"

RPROVIDES:${PN} += "sbcl \
sbcl(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
