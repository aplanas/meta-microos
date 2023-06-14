SUMMARY = "Haskell network-bsd profiling library"
DESCRIPTION = "This package provides the Haskell network-bsd profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-prof-2.8.1.0-7.2.aarch64.rpm"
RPM_HASH = "a632953f49758b76870b79509d466366225450c73011924158e1d34cb3ff2665024f77e736fd8e758c655695a5a5b43bc40ec7effacc8ab05367b0859546b195"

RPROVIDES:${PN} += "ghc-network-bsd-prof \
ghc-prof-network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll"

RDEPENDS:${PN} += "ghc-network-bsd-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd"

inherit rpm
