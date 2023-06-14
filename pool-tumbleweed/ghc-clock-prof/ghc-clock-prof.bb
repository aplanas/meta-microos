SUMMARY = "Haskell clock profiling library"
DESCRIPTION = "This package provides the Haskell clock profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "ghc-clock-prof-0.8.3-2.2.aarch64.rpm"
RPM_HASH = "a3c3d6966c007f8ce0a1b71bda7b3381639525e81d23f988fc3b952fd9e9fc71f8c57fa7f528c2d1776a65283f4c18bdcc550232b50544b7e164982afcbc59cf"

RPROVIDES:${PN} += "ghc-clock-prof \
ghc-prof-clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV"

RDEPENDS:${PN} += "ghc-clock-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
