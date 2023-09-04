SUMMARY = "Haskell aeson-pretty profiling library"
DESCRIPTION = "This package provides the Haskell aeson-pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-aeson-pretty-prof-0.8.10-1.4.aarch64.rpm"
RPM_HASH = "ddde7a08781a05e36a8cc67c0a1c31b7c9d3a64b0454064d9a14d894f2bec2c5c51461dc767f317a9ad71601ce7926e06faa1668f3c7c3071f281431aeeec868"

RPROVIDES:${PN} += "ghc-aeson-pretty-prof \
ghc-prof-aeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk"

RDEPENDS:${PN} += "ghc-aeson-pretty-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
