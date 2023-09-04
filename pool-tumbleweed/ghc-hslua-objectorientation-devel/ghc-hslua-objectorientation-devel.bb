SUMMARY = "Haskell hslua-objectorientation library development files"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library \
development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-devel-2.3.0-1.4.aarch64.rpm"
RPM_HASH = "12e7bc5b3d8540c0532856e46484427e7ade3b3630cc526e9710e69830f96317fc3b9bd855348fd5be0b8b21182f14acb95af23699dac9983c1669eb6df35ec4"

RPROVIDES:${PN} += "ghc-devel-hslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS \
ghc-hslua-objectorientation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-objectorientation"

inherit rpm
