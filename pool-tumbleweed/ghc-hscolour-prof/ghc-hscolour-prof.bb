SUMMARY = "Haskell hscolour profiling library"
DESCRIPTION = "This package provides the Haskell hscolour profiling library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-prof-1.24.4-4.8.aarch64.rpm"
RPM_HASH = "afdfd842ed5b1bc056944afa641d662f25f0c4a7db16c6a59a0f9aed9956a756bd6e5df464265ef453d259fb90b050d5c068c1b3255af6a0c4871a17687e895e"

RPROVIDES:${PN} += "ghc-hscolour-prof \
ghc-prof-hscolour-1.24.4-LJeKwNXAf207wSFk6wkP8w"

RDEPENDS:${PN} += "ghc-hscolour-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7"

inherit rpm
