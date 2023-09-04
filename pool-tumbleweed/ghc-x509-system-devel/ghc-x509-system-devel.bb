SUMMARY = "Haskell x509-system library development files"
DESCRIPTION = "This package provides the Haskell x509-system library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-devel-1.6.7-2.8.aarch64.rpm"
RPM_HASH = "d296a5f3cc34f0f8f84782d2a8ebabfed85417ed5ce1cde12421809bee2515de3aabb5769bded530638dd318b81bcaf511873fc4360cad1c95f7859145621077"

RPROVIDES:${PN} += "ghc-devel-x509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY \
ghc-x509-system-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-devel-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-x509-system"

inherit rpm
