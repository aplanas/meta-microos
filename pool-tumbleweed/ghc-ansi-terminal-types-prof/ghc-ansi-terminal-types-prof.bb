SUMMARY = "Haskell ansi-terminal-types profiling library"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-prof-0.11.5-1.3.aarch64.rpm"
RPM_HASH = "dff1e320fc91593a0d41ea0e5c0db3afa691e24f8c080ecc0c15d26e8f8319181b9978bd56f89fc94aee2547778f725048a88c9c44b3f84bbd90abfd376119d7"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-prof \
ghc-prof-ansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp"

RDEPENDS:${PN} += "ghc-ansi-terminal-types-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-colour-2.3.6-GBcey48GJNAK3398XtiZDq"

inherit rpm
