SUMMARY = "Haskell ansi-terminal-types library development files"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-devel-0.11.5-1.3.aarch64.rpm"
RPM_HASH = "61b5fa315087c47ecadaa5b9df38a454315cfd07b19a4be9522820c4ab17cc474b32e356da0e711007b3170ad3a13ed911d7238e40e1e2eb68260620e63a3ab6"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-devel \
ghc-devel-ansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ansi-terminal-types \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-colour-2.3.6-GBcey48GJNAK3398XtiZDq"

inherit rpm
