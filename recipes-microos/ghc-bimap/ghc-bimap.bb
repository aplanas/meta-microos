SUMMARY = "Bidirectional mapping between two key types"
DESCRIPTION = "A data structure representing a bidirectional mapping between two key types. \
Each value in the bimap is associated with exactly one value of the opposite \
type."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-0.5.0-2.2.aarch64.rpm"
RPM_HASH = "ae0fec544631955956e00926d5d388a5c2aeda7fd66daac22629e4f73b3d0e879481de7e40011d92642911d9cd6baf91ecc4592a9dac866ae8324013a3af15ed"

RPROVIDES:${PN} += "ghc-bimap \
ghc-bimap(aarch-64) \
libHSbimap-0.5.0-3nKyJuRybYg2I5XOsBhwKE-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
