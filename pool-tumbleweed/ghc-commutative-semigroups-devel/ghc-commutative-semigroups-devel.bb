SUMMARY = "Haskell commutative-semigroups library development files"
DESCRIPTION = "This package provides the Haskell commutative-semigroups library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-devel-0.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "fb8c189bc786dd9cdc470a5deea12e43db859c545644bdaac671c8172d738f00dc93b7eeb95798494a484b5f8ac1e995f18785d06558032b67a8937e54f0f051"

RPROVIDES:${PN} += "ghc-commutative-semigroups-devel \
ghc-devel-commutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commutative-semigroups \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7"

inherit rpm
