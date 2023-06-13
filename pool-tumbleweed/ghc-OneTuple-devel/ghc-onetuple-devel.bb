SUMMARY = "Haskell OneTuple library development files"
DESCRIPTION = "This package provides the Haskell OneTuple library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-OneTuple-devel-0.3.1-4.2.aarch64.rpm"
RPM_HASH = "2ebeae67298fb12a6cdb017bd235750b12b9223c86ab01e5d135fda161c4f2213c6f2bcdd7d37abba6ab834198d111c6e7d51249e4a15e5731f298e689abe6ea"

RPROVIDES:${PN} += "ghc-OneTuple-devel \
ghc-OneTuple-devel(aarch-64) \
ghc-devel(OneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd)"

RDEPENDS:${PN} += "/bin/sh \
ghc-OneTuple \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(template-haskell-2.19.0.0)"

inherit rpm
