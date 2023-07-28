SUMMARY = "Haskell skylighting library development files"
DESCRIPTION = "This package provides the Haskell skylighting library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4"

RPM_NAME = "ghc-skylighting-devel-0.13.4-1.1.aarch64.rpm"
RPM_HASH = "c758f278dd57902d5b37127559bbe858cfdd8fb9eda8187f660291c9297ff710b94f472a89f596ca5b648db87dff57521b8249fbd62d23d9e70e9f35877db5aa"

RPROVIDES:${PN} += "ghc-devel-skylighting-0.13.4-5T99F0BkgIQGejRNYUpHqn \
ghc-skylighting-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-devel-skylighting-format-ansi-0.1-Bs7UZk06X7gCvm9EWhhFHl \
ghc-devel-skylighting-format-blaze-html-0.1.1-2S5li2Ic3P8IXVFqKrjQNX \
ghc-devel-skylighting-format-context-0.1.0.2-DaN7b6FAIhw69Ip8uy59f9 \
ghc-devel-skylighting-format-latex-0.1-KUWKzkdJqvB1foV6pwv6yZ \
ghc-skylighting"

inherit rpm
