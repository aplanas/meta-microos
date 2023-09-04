SUMMARY = "Haskell code-page library development files"
DESCRIPTION = "This package provides the Haskell code-page library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-devel-0.2.1-2.7.aarch64.rpm"
RPM_HASH = "c6e2263312c9f1ea011125a71db7e2c83d5cbc7c2bd037932accc35ca825f5aeb30005560f1dc5a6a52ac766ddb82cbe07289f65d363a137e696f59d225e1a7a"

RPROVIDES:${PN} += "ghc-code-page-devel \
ghc-devel-code-page-0.2.1-FtqibIt49dG4EHKj0zD5sM"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-code-page \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
