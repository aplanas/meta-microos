SUMMARY = "Haskell syb profiling library"
DESCRIPTION = "This package provides the Haskell syb profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.4"

RPM_NAME = "ghc-syb-prof-0.7.2.4-1.3.aarch64.rpm"
RPM_HASH = "00dc15ce6f6411087b594f0961de72467e280455679c0ab1e939d1eabac411f0d819ec76a1ce2e2d529dde50722922342af6ab5b1f21f9442f552feac705b467"

RPROVIDES:${PN} += "ghc-prof-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-syb-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-syb-devel"

inherit rpm
