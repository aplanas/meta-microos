SUMMARY = "Haskell hjsmin library development files"
DESCRIPTION = "This package provides the Haskell hjsmin library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-devel-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "b2528d346db54d0af4d8b1d57e66dbad368895e0b08f728e9f5110caf4897c1bb7e01c98224a49fca4ee7cc7c984cb1245ceca27fcd8207a65617fdeca869473"

RPROVIDES:${PN} += "ghc-devel-hjsmin-0.2.1-1Nqa77EAma94x2VWIbRoKX \
ghc-hjsmin-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-language-javascript-0.7.1.0-LEIqziehkytABOWYmhOylg \
ghc-devel-text-2.0.2 \
ghc-hjsmin"

inherit rpm
