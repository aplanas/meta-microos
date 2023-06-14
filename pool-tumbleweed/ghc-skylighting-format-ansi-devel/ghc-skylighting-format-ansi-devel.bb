SUMMARY = "Haskell skylighting-format-ansi library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-devel-0.1-2.3.aarch64.rpm"
RPM_HASH = "da52e45a696c2f213bbff8b2ec36fab6232c45d38351aee0008c8bd184466666c51a7c96c04af5c48461e1ef941ec22f48880aaebd995b473a4f5bbf404b2367"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-ansi-0.1-37mK2ZS7ued5gd5quPggBj \
ghc-skylighting-format-ansi-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63 \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-ansi"

inherit rpm
