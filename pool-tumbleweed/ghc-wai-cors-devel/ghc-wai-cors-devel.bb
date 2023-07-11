SUMMARY = "Haskell wai-cors library development files"
DESCRIPTION = "This package provides the Haskell wai-cors library development files."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-devel-0.2.7-1.3.aarch64.rpm"
RPM_HASH = "938406c57899f041e7340ea7de4222bea64b8c8050039e86fe9d8fdd3966cb6e561d0fb18ab21cc103c1da5b80fbd8cbafac7a75f68c4bb4f4a674c7f1263eec"

RPROVIDES:${PN} += "ghc-devel-wai-cors-0.2.7-837xDMoVzk8L5Mw3yyuBT9 \
ghc-wai-cors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-unicode-symbols-0.2.4.2-2uW4hd16ZmNBkWsH22htOC \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-cors"

inherit rpm
