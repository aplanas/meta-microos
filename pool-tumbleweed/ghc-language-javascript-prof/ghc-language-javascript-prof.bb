SUMMARY = "Haskell language-javascript profiling library"
DESCRIPTION = "This package provides the Haskell language-javascript profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-prof-0.7.1.0-4.9.aarch64.rpm"
RPM_HASH = "1290be3e249da2e3dd6aebd8a67fa248b8b4d53aca807494bde7bfa121fb7e553b461de48996192cd8687739e36a9f7e13576ff20ab4e8c0f6f2f1fc0e506dd4"

RPROVIDES:${PN} += "ghc-language-javascript-prof \
ghc-prof-language-javascript-0.7.1.0-5tkeoDchqnObRztPRYxz4"

RDEPENDS:${PN} += "ghc-language-javascript-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
