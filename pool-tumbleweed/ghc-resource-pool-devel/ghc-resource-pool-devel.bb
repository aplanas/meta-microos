SUMMARY = "Haskell resource-pool library development files"
DESCRIPTION = "This package provides the Haskell resource-pool library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-devel-0.4.0.0-2.3.aarch64.rpm"
RPM_HASH = "a2d736a0a24436e9be9b4075c76f1f175737aec818d0c3f11c0a1802d123c086f16387e7a8a89cd30d8189f8ce895d6e8d058188e628187867d132a484061fb3"

RPROVIDES:${PN} += "ghc-devel(resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW) \
ghc-resource-pool-devel \
ghc-resource-pool-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-devel(time-1.12.2) \
ghc-resource-pool"

inherit rpm
