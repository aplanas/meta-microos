SUMMARY = "Haskell ansi-wl-pprint profiling library"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-prof-0.6.9-11.2.aarch64.rpm"
RPM_HASH = "f9796296ee2ca941dae8861915f925dc9ac5da40c3d716fea7e34a5bbf95b019140f18b031418e5d0d1b997a6c2c4c581828bc8625e883fd0ec3ebe2d682e975"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-prof \
ghc-prof-ansi-wl-pprint-0.6.9-Akll4C7DaaL4wD8pj4jz8a"

RDEPENDS:${PN} += "ghc-ansi-wl-pprint-devel \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0"

inherit rpm
