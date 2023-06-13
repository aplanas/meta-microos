SUMMARY = "Haskell ansi-terminal-types library development files"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-devel-0.11.5-1.2.aarch64.rpm"
RPM_HASH = "817e55ab1ffb8a6d6c68850fdc119f94650817a8a880155421f0152ecc9d90dbd8b63c69e89afdccebf1a9e6c81a334e4a36f533743c12a24fd3c551067830e7"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-devel \
ghc-ansi-terminal-types-devel(aarch-64) \
ghc-devel(ansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR)"

RDEPENDS:${PN} += "/bin/sh \
ghc-ansi-terminal-types \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln)"

inherit rpm
