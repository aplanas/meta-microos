SUMMARY = "Haskell cipher-aes library development files"
DESCRIPTION = "This package provides the Haskell cipher-aes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-devel-0.2.11-4.5.aarch64.rpm"
RPM_HASH = "260273b0713dd566abcbafd673de74af7106b9f117ed3a6948fdb10408c64ed3fd8fa359c7b5baadca1d0146842d1ed1ac70f3b34526e2604a2549f59fc62a3d"

RPROVIDES:${PN} += "ghc-cipher-aes-devel \
ghc-devel-cipher-aes-0.2.11-J6Bfrfqg5Tl79OIpP67OVG"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cipher-aes \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-crypto-cipher-types-0.0.9-6FlBjXMHauN3ENUNZLdeKl \
ghc-devel-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4"

inherit rpm
