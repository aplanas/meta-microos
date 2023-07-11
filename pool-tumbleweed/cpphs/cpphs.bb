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

RPM_NAME = "cpphs-1.20.9.1-5.6.aarch64.rpm"
RPM_HASH = "e2b62ec38f6ce00725e960926017d84b7dc126bed5bde8f5a7d6323eb30d7981e16d634e54ba68bedc22560ba58a334ee917fd4b5f15390cd63883f843279ed2"

RPROVIDES:${PN} += "cpphs"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
