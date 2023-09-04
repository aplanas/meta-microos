SUMMARY = "Haskell deriving-aeson profiling library"
DESCRIPTION = "This package provides the Haskell deriving-aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-prof-0.2.9-3.1.aarch64.rpm"
RPM_HASH = "79aa1bf7650a9f736e75cd15af8a420def5acde11e81430c00be06ddcb85487f5798fc108062dd52347e48c132403c798eda43f9b254f610cfaf6fe3bf429f2b"

RPROVIDES:${PN} += "ghc-deriving-aeson-prof \
ghc-prof-deriving-aeson-0.2.9-7GG7RbiGvWZJpJcDU5qu5W"

RDEPENDS:${PN} += "ghc-deriving-aeson-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0"

inherit rpm
