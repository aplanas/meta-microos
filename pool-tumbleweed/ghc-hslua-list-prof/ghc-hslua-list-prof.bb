SUMMARY = "Haskell hslua-list profiling library"
DESCRIPTION = "This package provides the Haskell hslua-list profiling library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-prof-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "2e26f1482a0239a6245477c9935bbe728b924b9a6ea16d53be6955ca32a21ed6ff062e07b2a83e06a155c09ba97a995dbbe4d661c6fbbbcc62a2fd5e8ee860d6"

RPROVIDES:${PN} += "ghc-hslua-list-prof \
ghc-hslua-list-prof(aarch-64) \
ghc-prof(hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A)"

RDEPENDS:${PN} += "ghc-hslua-list-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC)"

inherit rpm
