SUMMARY = "Haskell bencode library development files"
DESCRIPTION = "This package provides the Haskell bencode library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-devel-0.6.1.1-4.8.aarch64.rpm"
RPM_HASH = "af6264f3460dc08a004014aae16719aa748919753bc805105d13a0c4173fd5a3c4eaf17babaece3fc0650583fa86ff2d9fea4dad9cef6ce1379ee7b99f1fd249"

RPROVIDES:${PN} += "ghc-bencode-devel \
ghc-devel-bencode-0.6.1.1-26x5GmL2BHOEu40VootDht"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bencode \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
