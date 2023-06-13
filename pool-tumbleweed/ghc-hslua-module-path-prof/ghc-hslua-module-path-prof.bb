SUMMARY = "Haskell hslua-module-path profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-path profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-prof-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "beac713a8410957936854709d2ca90183a559308d2c23e73b08682ced0bfd3405c8c22bc1060afd6150636f6d60702b2c7c329444c8dd7acda507e6b678b0a4c"

RPROVIDES:${PN} += "ghc-hslua-module-path-prof \
ghc-hslua-module-path-prof(aarch-64) \
ghc-prof(hslua-module-path-1.1.0-H35lL8Cos84Ew14x3WsMMD)"

RDEPENDS:${PN} += "ghc-hslua-module-path-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-prof(text-2.0.2)"

inherit rpm
