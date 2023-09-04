SUMMARY = "Haskell hslua-marshalling library development files"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library development \
files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-devel-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "f947898434acac8e108d94ec21ff83b58d63874f256b3386540cb1fb97cceb3a1c3331b0bf5f9a77f7c5a9e5d55628a52404f0117b04b36395530347733d0221"

RPROVIDES:${PN} += "ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-hslua-marshalling-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-marshalling"

inherit rpm
