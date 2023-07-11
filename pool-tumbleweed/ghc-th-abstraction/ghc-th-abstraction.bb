SUMMARY = "Nicer interface for reified information about data types"
DESCRIPTION = "This package normalizes variations in the interface for inspecting datatype \
information via Template Haskell so that packages and support a single, easier \
to use informational datatype while supporting many versions of Template \
Haskell."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-0.4.5.0-2.6.aarch64.rpm"
RPM_HASH = "c91986818716e036cbb6195534fbf0965966c4d8d7c5b082f306e399c52a32898882ef6066baef22186708afad2488ec4f581cf1d4f723dd9338cace03a04214"

RPROVIDES:${PN} += "ghc-th-abstraction \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
