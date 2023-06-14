SUMMARY = "Basic mime-type handling types and functions"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/mime-types>."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-0.1.1.0-2.2.aarch64.rpm"
RPM_HASH = "12383aceda7988bfe7d9a45691765156b2a770edd5aa03255ddc78e2be87a809fdd43e260ade206a0c6f4e2645ad7f168195b748b8441ae34c1f99f9bed58a48"

RPROVIDES:${PN} += "ghc-mime-types \
libHSmime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
