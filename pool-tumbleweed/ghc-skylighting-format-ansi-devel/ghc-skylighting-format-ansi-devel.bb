SUMMARY = "Haskell skylighting-format-ansi library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-devel-0.1-2.10.aarch64.rpm"
RPM_HASH = "fcb561ec232080241ee8911e847562eb2adad09b92dcb0ca3954b137b0f4031eff29c5fffc94d677cb52fce4979dde46af7e00d6ccadbf2297a1d6cf75067fd8"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-ansi-0.1-6YWd7hT12ae6ct6gjoY3vc \
ghc-skylighting-format-ansi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-ansi"

inherit rpm
