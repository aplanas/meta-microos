SUMMARY = "Haskell silently library development files"
DESCRIPTION = "This package provides the Haskell silently library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-devel-1.2.5.3-2.3.aarch64.rpm"
RPM_HASH = "a6a6bc373384dab5eeb676da8d324cb8f7aff94ed1cfbb63b094d2eaed747114facff608b1a837de24a8c7edfbe572f97f5cb30f603540d48c961e0f71150481"

RPROVIDES:${PN} += "ghc-devel-silently-1.2.5.3-DooEMl8ysOU4ZpgKypCRy8 \
ghc-silently-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-silently"

inherit rpm
