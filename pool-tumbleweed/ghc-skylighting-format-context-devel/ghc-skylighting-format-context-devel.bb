SUMMARY = "Haskell skylighting-format-context library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-devel-0.1.0.2-1.10.aarch64.rpm"
RPM_HASH = "8612b8e715e1642035197636cc3ab24eb0b5c5ec4bb505dc4926206975900d4d8cbb8ace974a3d9d8888c59e652e443f514a6e4bdf01b2f63ad4c44bc00858b7"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-context-0.1.0.2-DKquH4NR4zs5BA4tBpnI9m \
ghc-skylighting-format-context-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-context"

inherit rpm
