SUMMARY = "Efficient Streams"
DESCRIPTION = "Simple yet powerful monadic streams that are used as a backbone for vector \
package fusion functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-0.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "e30b8972c3f9b35dc911ff9edd8df498b9ad837e4740661d70864e7c0b57910d7fd207e26993b9086a65b7add7646ad5067ff4b3ccacd00658dcbd47d516b8da"

RPROVIDES:${PN} += "ghc-vector-stream \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
