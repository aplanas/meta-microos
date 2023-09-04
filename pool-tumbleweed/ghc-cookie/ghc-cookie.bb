SUMMARY = "HTTP cookie parsing and rendering"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <https://www.stackage.org/package/cookie>."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "e3a4065f1de7be85d47dd62b02bd45f00ac5c6b7b031e4c85dd25b78bfc24b27430b3d37843c6a43dd6af06af200b3f3328709da93782e5d1fa735a7fd106454"

RPROVIDES:${PN} += "ghc-cookie \
libHScookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
