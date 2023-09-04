SUMMARY = "Simple functional ring type"
DESCRIPTION = "Simple functional bidirectional ring type. Given that the ring terminiology \
clashes with certain mathematical branches, we're using the term CList or \
CircularList instead."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-0.2-2.3.aarch64.rpm"
RPM_HASH = "6f60474ddb4abfd04729a9575245e125ce69a34dc8c638fe3e50db2d0ac0751b4d021d7d5013ebd49b5bed5e790f16b7ad3c874f3f1a045b3145a55dae3b4138"

RPROVIDES:${PN} += "ghc-data-clist \
libHSdata-clist-0.2-2XS2LK92Ow8274ZzRlQjKH-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
