SUMMARY = "Haskell x509-system profiling library"
DESCRIPTION = "This package provides the Haskell x509-system profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-prof-1.6.7-2.8.aarch64.rpm"
RPM_HASH = "e49ca6eb69e697e19165f5f723297b0a9d52f83b2403f09d45c605401fedc6051f01d4804e30cc93505a520bdf6354ce1dd1144681b96b7194d58f3815a7eb2d"

RPROVIDES:${PN} += "ghc-prof-x509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY \
ghc-x509-system-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-prof-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-x509-system-devel"

inherit rpm
