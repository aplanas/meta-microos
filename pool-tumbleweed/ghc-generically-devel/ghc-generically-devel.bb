SUMMARY = "Haskell generically library development files"
DESCRIPTION = "This package provides the Haskell generically library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-devel-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "4404f645bb00161ac41803f2778e0aa8b5b6fb24879475656a6f26ccaf57f6e4bc8b87c082444c87353f4906f5c4ed690902128053a4e2cfb03e5042568adb5b"

RPROVIDES:${PN} += "ghc-devel-generically-0.1.1-9IDkuVjdBOA27Mdybf3GBx \
ghc-generically-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-generically"

inherit rpm
