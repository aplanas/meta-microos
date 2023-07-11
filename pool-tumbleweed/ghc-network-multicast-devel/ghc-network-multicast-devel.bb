SUMMARY = "Haskell network-multicast library development files"
DESCRIPTION = "This package provides the Haskell network-multicast library development \
files."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-devel-0.3.2-4.3.aarch64.rpm"
RPM_HASH = "814001dd8b0b2cc6a32f705570ec332780c149df4c6beafbc7eff3d8383efc555868fcb80251bf515542b2b6dcceb81b2f6f5c9928b837aab3aa73a821706fed"

RPROVIDES:${PN} += "ghc-devel-network-multicast-0.3.2-4WWinAJ7bwBLL5fL2eaYym \
ghc-network-multicast-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-bsd-2.8.1.0-K9geVudEUPh9zpSal1iibE \
ghc-network-multicast"

inherit rpm
