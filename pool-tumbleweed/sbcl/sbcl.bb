SUMMARY = "Steel Bank Common Lisp"
DESCRIPTION = "Steel Bank Common Lisp (SBCL) is a high performance Common Lisp \
compiler. It is open source / free software, with a permissive license. \
In addition to the compiler and runtime system for ANSI Common Lisp, it \
provides an interactive environment including a debugger, a statistical \
profiler, a code coverage tool, and many other extensions."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2.3.7"

RPM_NAME = "sbcl-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "f17bd519bdc06a5c93bc470e26ad13736ba4023f92e8c67b80abc2b8551d69c18cb03e1658d98af16212ab4499694b4819ab3e928ca11ebe6c0abd60b3398b78"

RPROVIDES:${PN} += "sbcl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzstd.so.1"

inherit rpm
