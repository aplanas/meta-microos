SUMMARY = "Haskell ansi-terminal library development files"
DESCRIPTION = "This package provides the Haskell ansi-terminal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-devel-0.11.5-1.2.aarch64.rpm"
RPM_HASH = "91a7ea4e9ff44d04aa9ab5bccb5ca237b5ca5e93f5fb0e1d9c2ccdf26793ea110b254e783754f3864c59b2c825b499b629b9c850be9b4075e12996b492d24432"

RPROVIDES:${PN} += "ghc-ansi-terminal-devel \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ansi-terminal \
ghc-compiler \
ghc-devel-ansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR \
ghc-devel-base-4.17.1.0 \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln"

inherit rpm
