SUMMARY = "Haskell resource-pool profiling library"
DESCRIPTION = "This package provides the Haskell resource-pool profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-prof-0.4.0.0-2.6.aarch64.rpm"
RPM_HASH = "4f8e9d10233ec071b033cd58092b4b90be93a3013cedffb1441c787f563f9a45b9e3ea2eb637f1bd5b61d125fff4dd48f605961d69f428798dc4a3b8d4e41bf9"

RPROVIDES:${PN} += "ghc-prof-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-resource-pool-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-time-1.12.2 \
ghc-resource-pool-devel"

inherit rpm
