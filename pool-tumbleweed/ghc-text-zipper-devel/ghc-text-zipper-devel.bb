SUMMARY = "Haskell text-zipper library development files"
DESCRIPTION = "This package provides the Haskell text-zipper library development files."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "ghc-text-zipper-devel-0.12-2.3.aarch64.rpm"
RPM_HASH = "1c7bb509224d2aa5a8fd52c675c9a7831f5b65a0b87438253895f5f3ef9f93e1cf5359f1eabc5d0e67cdf3351b706c678584867c01b131583c878a87f148996b"

RPROVIDES:${PN} += "ghc-devel-text-zipper-0.12-H7IYZaS5uJc9wNiAP20WIH \
ghc-text-zipper-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-text-2.0.2 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-text-zipper"

inherit rpm
