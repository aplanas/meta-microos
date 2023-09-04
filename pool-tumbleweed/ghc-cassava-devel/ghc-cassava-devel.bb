SUMMARY = "Haskell cassava library development files"
DESCRIPTION = "This package provides the Haskell cassava library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-devel-0.5.3.0-4.3.aarch64.rpm"
RPM_HASH = "d8445cc7cbc542fd2cb7714cb3505d783f790696025303ed5138a83611d7170b04c8fbfc560b15786e6e4601168f0b0db7cfecc9e98a076864df733a8c952ca1"

RPROVIDES:${PN} += "ghc-cassava-devel \
ghc-devel-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cassava \
ghc-compiler \
ghc-devel-Only-0.1-qCrN026ulaL2ZFxnlcrV1 \
ghc-devel-array-0.5.4.0 \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
