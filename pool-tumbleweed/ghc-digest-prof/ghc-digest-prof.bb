SUMMARY = "Haskell digest profiling library"
DESCRIPTION = "This package provides the Haskell digest profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-prof-0.0.1.7-1.8.aarch64.rpm"
RPM_HASH = "322190e56bcb998911007004a45ab40d0fa14e3c3e02f3596be619604fd4eaa9fce8e872abbc802863ce76a9c9a35bddf2c97f9902545a2bc19475a51cffc61d"

RPROVIDES:${PN} += "ghc-digest-prof \
ghc-prof-digest-0.0.1.7-x22LVSWrXSB7L6QfE4JoE"

RDEPENDS:${PN} += "ghc-digest-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
