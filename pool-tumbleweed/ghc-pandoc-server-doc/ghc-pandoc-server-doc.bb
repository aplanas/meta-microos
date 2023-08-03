SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-doc-0.1.0.1-1.5.noarch.rpm"
RPM_HASH = "f1b01c256979aa8c3c7bfc8a310327b6aaa1648d139fbacb2e36565b69c62701b6f5ffb7df6a919659bf27221d4269b3a9a984bedb76a4117ad7a58cb05e27e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
