SUMMARY = "Haskell utility-ht profiling library"
DESCRIPTION = "This package provides the Haskell utility-ht profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-utility-ht-prof-0.0.16-2.3.aarch64.rpm"
RPM_HASH = "636b5669bcd95fb13ba89b36b92fb7d6b25e93fc2f88380fb4861101fed424667d43a407bcb42504482be898f702583949afcf0362f9c1ad3b3988742b17ad7e"

RPROVIDES:${PN} += "ghc-prof-utility-ht-0.0.16-CDN97AfZiejDC1itvZ2hyN \
ghc-utility-ht-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-utility-ht-devel"

inherit rpm
