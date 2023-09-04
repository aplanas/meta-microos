SUMMARY = "Anaphoric and miscellaneous useful control-flow"
DESCRIPTION = "Anaphoric and miscellaneous useful control-flow."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-0.85-4.3.aarch64.rpm"
RPM_HASH = "939303478177c4aaf0d25119fef17e50a29ec2eb7b4adcd0f09d83a6b1028610fdd778ca838fc1263eea23bf9861c1e9a66394a88b36b61edc9d548099838aa9"

RPROVIDES:${PN} += "ghc-IfElse \
libHSIfElse-0.85-2pDYDhNcKvHGxAsencQysh-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
