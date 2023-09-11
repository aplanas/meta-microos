SUMMARY = "Haskell skylighting-format-blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-prof-0.1.1.1-1.1.aarch64.rpm"
RPM_HASH = "82d828e7e12f51f10d06772a64df43f3df05a3b1a406cb044e03b60433df99c7a0b1678ccc6a5bc056bb845bb90a8275ecd196bcd90ea1f862c78c9dae633272"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-blaze-html-0.1.1.1-8h5SzfFcahBGtm6dLTrui7 \
ghc-skylighting-format-blaze-html-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-blaze-html-devel"

inherit rpm
