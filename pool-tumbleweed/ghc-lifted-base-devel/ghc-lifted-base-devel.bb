SUMMARY = "Haskell lifted-base library development files"
DESCRIPTION = "This package provides the Haskell lifted-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-devel-0.2.3.12-8.3.aarch64.rpm"
RPM_HASH = "0ebc1dcc4ae2956a3665522bd63e0b39fc414ee4ab055a75249fff8b4acb5f510a6e7211331414b76807a7f0d7e5482ceae2a65262a5eb1a682d9fbbce821828"

RPROVIDES:${PN} += "ghc-devel(lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo) \
ghc-lifted-base-devel \
ghc-lifted-base-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX) \
ghc-devel(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) \
ghc-lifted-base"

inherit rpm
