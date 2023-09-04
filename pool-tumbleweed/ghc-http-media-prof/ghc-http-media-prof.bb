SUMMARY = "Haskell http-media profiling library"
DESCRIPTION = "This package provides the Haskell http-media profiling library."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-prof-0.8.0.0-6.9.aarch64.rpm"
RPM_HASH = "b4b52f94147c76d3b42a6decd4f015582fcd40c97eff47474e86a047737462b90a1068b7e76fe92aa905d91731d7366781550dc48e93bd9659dd04aa725390c3"

RPROVIDES:${PN} += "ghc-http-media-prof \
ghc-prof-http-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb"

RDEPENDS:${PN} += "ghc-http-media-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
