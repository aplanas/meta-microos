SUMMARY = "Haskell socks library documentation"
DESCRIPTION = "This package provides the Haskell socks library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-doc-0.6.1-6.3.noarch.rpm"
RPM_HASH = "67155e100dcf989716a18b44246fe62ce5e6092be8ee8d5d031aaff7de2acb446249a8cc630344f27a391793566c1ca3f5de857c5967954d8a727033b8f20fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-socks-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
