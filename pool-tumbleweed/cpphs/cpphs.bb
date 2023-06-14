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

RPM_NAME = "cpphs-1.20.9.1-5.3.aarch64.rpm"
RPM_HASH = "6535b49fd58ea2003943203e653ff96ec72b38c51fbb0759146bb0ddc2982ecb402186e6417320564a77e3981c2cb8988bb329d168c6c1975cd8c69c635d1bc0"

RPROVIDES:${PN} += "cpphs"

RDEPENDS:${PN} += "libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
