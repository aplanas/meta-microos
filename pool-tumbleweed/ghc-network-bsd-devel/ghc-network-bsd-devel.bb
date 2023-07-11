SUMMARY = "Haskell network-bsd library development files"
DESCRIPTION = "This package provides the Haskell network-bsd library development files."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-devel-2.8.1.0-7.3.aarch64.rpm"
RPM_HASH = "790b54ecb1c69fa5d6221911967cfab5b5feab80cdbc8f626327553460b2711276ed215cfc5f25fb4c1f31811679f54fdae34d0990a91582fb0d8accd1a3a4b6"

RPROVIDES:${PN} += "ghc-devel-network-bsd-2.8.1.0-K9geVudEUPh9zpSal1iibE \
ghc-network-bsd-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-network-bsd"

inherit rpm
