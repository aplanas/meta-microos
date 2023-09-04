SUMMARY = "Haskell hscolour library development files"
DESCRIPTION = "This package provides the Haskell hscolour library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-devel-1.24.4-4.8.aarch64.rpm"
RPM_HASH = "a4502c226c580cac4ba3307a14e4a9d8742a6a4ed76c547f1c92498dc142c8256e67471f0644bc8fced50f97d8835e21fe86bbb1bbf06f131a1e43b11669ccb3"

RPROVIDES:${PN} += "ghc-devel-hscolour-1.24.4-LJeKwNXAf207wSFk6wkP8w \
ghc-hscolour-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-hscolour"

inherit rpm
