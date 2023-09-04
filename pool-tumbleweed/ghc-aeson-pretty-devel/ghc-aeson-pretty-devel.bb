SUMMARY = "Haskell aeson-pretty library development files"
DESCRIPTION = "This package provides the Haskell aeson-pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-aeson-pretty-devel-0.8.10-1.4.aarch64.rpm"
RPM_HASH = "88b77d3032f0bc19f0687b9fd1d0e0d7deb258fa9b2e5e6b34f71c8575849f263e56bd14afb70d8c96ecd69c7f0e2b95d2a41a1bed2e47265de08ac467b9e523"

RPROVIDES:${PN} += "ghc-aeson-pretty-devel \
ghc-devel-aeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson-pretty \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
