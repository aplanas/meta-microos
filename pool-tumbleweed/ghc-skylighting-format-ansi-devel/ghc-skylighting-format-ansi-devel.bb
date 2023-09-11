SUMMARY = "Haskell skylighting-format-ansi library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-devel-0.1-2.11.aarch64.rpm"
RPM_HASH = "827be2b3a1a9dd42fefa5960268176fa1af6b931ecc716e0e6590ae9fada48ffae773f85c5fbaefdc841ed0aa60078ba3150694270e3faddbfff9312b02aedf8"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-ansi-0.1-8FyF1SOujOsEQ3XyvF7m1i \
ghc-skylighting-format-ansi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-ansi"

inherit rpm
