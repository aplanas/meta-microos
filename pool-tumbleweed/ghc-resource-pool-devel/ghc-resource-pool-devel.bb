SUMMARY = "Haskell resource-pool library development files"
DESCRIPTION = "This package provides the Haskell resource-pool library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-devel-0.4.0.0-2.6.aarch64.rpm"
RPM_HASH = "294cf0a82c094b55b6617a2d875bde0aa546570c411ef2c4deb2d62df9febc5953fb6e21869701c160ab3bed559bb80125cb4c37439c85f174c70c8d630455af"

RPROVIDES:${PN} += "ghc-devel-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-resource-pool-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-time-1.12.2 \
ghc-resource-pool"

inherit rpm
