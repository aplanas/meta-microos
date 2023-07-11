SUMMARY = "Haskell socks library development files"
DESCRIPTION = "This package provides the Haskell socks library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-devel-0.6.1-6.7.aarch64.rpm"
RPM_HASH = "cfa0ea6ed2fe840306f90807755cbc633594339769c2993e4d37b53ad4fe1f409f9aa33dc573e0cee1c3427cba90f0e1295a4dd89929c0fc4dfcf7203aeec458"

RPROVIDES:${PN} += "ghc-devel-socks-0.6.1-8gBEgerYb38E7aCOOcHCwN \
ghc-socks-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-socks"

inherit rpm
