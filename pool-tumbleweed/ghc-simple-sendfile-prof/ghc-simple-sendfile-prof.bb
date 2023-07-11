SUMMARY = "Haskell simple-sendfile profiling library"
DESCRIPTION = "This package provides the Haskell simple-sendfile profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-prof-0.2.32-1.2.aarch64.rpm"
RPM_HASH = "13e3e04887d6faccfde38af73ab60c6fece81897e6e3ed6c598de4d435aeca6700301a6263b6c5dd3d10ac955e18b9a08252df180851deabd21ceaec937ade97"

RPROVIDES:${PN} += "ghc-prof-simple-sendfile-0.2.32-4x5oTHfDDcT2QYoR9wedVb \
ghc-simple-sendfile-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-unix-2.7.3 \
ghc-simple-sendfile-devel"

inherit rpm
