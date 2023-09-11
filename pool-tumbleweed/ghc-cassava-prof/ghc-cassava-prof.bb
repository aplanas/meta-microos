SUMMARY = "Haskell cassava profiling library"
DESCRIPTION = "This package provides the Haskell cassava profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-prof-0.5.3.0-5.1.aarch64.rpm"
RPM_HASH = "5592412d4d9419301126a54ca08f0b75e6ee1b50894f5117afdd41daefa9c373afeeec2bb7f38b05a100009d4e32ad36ef9fcdcfc0301b18a0928c5832d7146f"

RPROVIDES:${PN} += "ghc-cassava-prof \
ghc-prof-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP"

RDEPENDS:${PN} += "ghc-cassava-devel \
ghc-prof-Only-0.1-qCrN026ulaL2ZFxnlcrV1 \
ghc-prof-array-0.5.4.0 \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
