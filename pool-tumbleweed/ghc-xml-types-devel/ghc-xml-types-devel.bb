SUMMARY = "Haskell xml-types library development files"
DESCRIPTION = "This package provides the Haskell xml-types library development files."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-devel-0.3.8-4.3.aarch64.rpm"
RPM_HASH = "8a3f5b3c67d272e245aab0fb97308f013f25abe06816e9d8566cd0acf4fd7a6ae05cecb668cd1235ece75ed513c4369dad318185e8011f48da84c9a0fb17ad0d"

RPROVIDES:${PN} += "ghc-devel-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6 \
ghc-xml-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-text-2.0.2 \
ghc-xml-types"

inherit rpm
