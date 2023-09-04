SUMMARY = "Haskell cassava-megaparsec library development files"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library development \
files."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-devel-2.0.4-3.5.aarch64.rpm"
RPM_HASH = "b13f6182b012e6913d12b2f9270041970169cad27cc1e94f0c5432f60d1c72e9dfa9e8eced42aeb3f3e34b3ced45d4984a30bc43def081686895b46b86ad6890"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-devel \
ghc-devel-cassava-megaparsec-2.0.4-C7KekE0MHcyFXF3lsApNgX"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cassava-megaparsec \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-devel-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
