SUMMARY = "Haskell ansi-terminal library development files"
DESCRIPTION = "This package provides the Haskell ansi-terminal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-devel-0.11.5-1.3.aarch64.rpm"
RPM_HASH = "8f75ee08e326238f14f83c508a4221659a2b8fdf54f035c7ad893499eefcf1cfb772c0f1f94650c4046cd54c6411ee9dda801de7cfec0c7a83219dc429e938bb"

RPROVIDES:${PN} += "ghc-ansi-terminal-devel \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ansi-terminal \
ghc-compiler \
ghc-devel-ansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp \
ghc-devel-base-4.17.2.0 \
ghc-devel-colour-2.3.6-GBcey48GJNAK3398XtiZDq"

inherit rpm
