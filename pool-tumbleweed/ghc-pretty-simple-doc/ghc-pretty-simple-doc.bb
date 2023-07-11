SUMMARY = "Haskell pretty-simple library documentation"
DESCRIPTION = "This package provides the Haskell pretty-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-doc-4.1.2.0-1.6.noarch.rpm"
RPM_HASH = "68815fe354dade3250d66fff9cb3a3692865df75fe7ff263d6547cf851aaa0d0192c9c2accf77573b84522b51c2e634a41c038772c8f15d072c727a7feae62af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-simple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
