SUMMARY = "Haskell th-lift-instances library documentation"
DESCRIPTION = "This package provides the Haskell th-lift-instances library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-doc-0.1.20-2.4.noarch.rpm"
RPM_HASH = "bf6f1a502b2c94f5b33f075b4ca8412bcc5e9658902ca53f57332acf41c976f4091cc9c4d072ec86e506d7319e2189c7f394a4825c2e8fa1f2fb4e87376d3b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-lift-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
