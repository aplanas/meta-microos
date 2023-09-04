SUMMARY = "Haskell doctemplates library development files"
DESCRIPTION = "This package provides the Haskell doctemplates library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-devel-0.11-1.7.aarch64.rpm"
RPM_HASH = "a1b00a02bb6e295381efe6af9c5de8bbee39cf0a9040c5319db9df96d8aec0b6416001c652457cb8673a6fd0621779d28f2efb4346d8913880037c7db54948e5"

RPROVIDES:${PN} += "ghc-devel-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-doctemplates-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-text-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-doctemplates"

inherit rpm
