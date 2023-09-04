SUMMARY = "Haskell ansi-terminal profiling library"
DESCRIPTION = "This package provides the Haskell ansi-terminal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-prof-0.11.5-1.3.aarch64.rpm"
RPM_HASH = "6b5c8f12fc57ad8c0e806e26460d4b2644060f0872885d4de709b94ed45ec900794f63ee7665941184b094e9979c9909ae7c571ad0737a4945c8cf27b3e0eae1"

RPROVIDES:${PN} += "ghc-ansi-terminal-prof \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3"

RDEPENDS:${PN} += "ghc-ansi-terminal-devel \
ghc-prof-ansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp \
ghc-prof-base-4.17.2.0 \
ghc-prof-colour-2.3.6-GBcey48GJNAK3398XtiZDq"

inherit rpm
