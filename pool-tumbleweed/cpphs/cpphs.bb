SUMMARY = "A liberalised re-implementation of cpp, the C pre-processor"
DESCRIPTION = "Cpphs is a re-implementation of the C pre-processor that is both more \
compatible with Haskell, and itself written in Haskell so that it can be \
distributed with compilers. \
 \
This version of the C pre-processor is pretty-much feature-complete and \
compatible with traditional (K&R) pre-processors. Additional features include: \
a plain-text mode; an option to unlit literate code files; and an option to \
turn off macro-expansion."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "cpphs-1.20.9.1-5.8.aarch64.rpm"
RPM_HASH = "e1c671a766f7f62ee3636103d1ec4746119fcbd49a845db2fba56c5e6d0c5539be3794a549e06b3ceed78f4b0399385186bae61931560af7f1b61f6c8db66874"

RPROVIDES:${PN} += "cpphs"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
