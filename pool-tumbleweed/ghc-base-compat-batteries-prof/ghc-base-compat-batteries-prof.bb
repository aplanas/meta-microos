SUMMARY = "Haskell base-compat-batteries profiling library"
DESCRIPTION = "This package provides the Haskell base-compat-batteries profiling library."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-batteries-prof-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "a2def2bd6ddb79e6c894720276ccbcf53ddbce436adcca945092a64fc9cec4f0b26b08844ea6ba6f555f4acde18e8def037882065879a468de379f918c87a3f7"

RPROVIDES:${PN} += "ghc-base-compat-batteries-prof \
ghc-prof-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR"

RDEPENDS:${PN} += "ghc-base-compat-batteries-devel \
ghc-prof-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-foldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
