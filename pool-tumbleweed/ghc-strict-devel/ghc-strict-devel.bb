SUMMARY = "Haskell strict library development files"
DESCRIPTION = "This package provides the Haskell strict library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-strict-devel-0.4.0.1-6.3.aarch64.rpm"
RPM_HASH = "075666145de7e093476f4cc2c61ba33d9c4c1180677c3e9ab05724d7a3a77907347c69f287ff9524856debf586b9c8e5dff4d280c345f769eddf09952b221797"

RPROVIDES:${PN} += "ghc-devel-strict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi \
ghc-strict-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-assoc-1.0.2-IAwklVGxRFw6xcadvaWWl7 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-text-2.0.2 \
ghc-devel-these-1.1.1.1-3POHYes25uBIW53bcrDd39 \
ghc-devel-transformers-0.5.6.2 \
ghc-strict"

inherit rpm
