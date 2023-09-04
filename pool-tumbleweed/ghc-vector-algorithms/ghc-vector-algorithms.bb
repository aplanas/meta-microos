SUMMARY = "Efficient algorithms for vector arrays"
DESCRIPTION = "Efficient algorithms for sorting vector arrays. At some stage other vector \
algorithms may be added."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-0.9.0.1-1.9.aarch64.rpm"
RPM_HASH = "d667b7bf2a0f8e7316342845fef61dcd558ab1772fe464d9c2673bfd55b83f86581a41ebdc214e17c0462524d583c0a4d5378f7d8906f01eca990559facb9a9a"

RPROVIDES:${PN} += "ghc-vector-algorithms \
libHSvector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
