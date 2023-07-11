SUMMARY = "Haskell network library development files"
DESCRIPTION = "This package provides the Haskell network library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-devel-3.1.4.0-1.3.aarch64.rpm"
RPM_HASH = "29cace5ada68bc73a8a998d5ac20cb092184eca2e943d07167b09633d08b8533fc818f21473b168eeeaefa152edd0b059c474b3c7cc32c5093142e113d3ec87c"

RPROVIDES:${PN} += "ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-network-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-network"

inherit rpm
