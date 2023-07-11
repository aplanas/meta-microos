SUMMARY = "Haskell glib library documentation"
DESCRIPTION = "This package provides the Haskell glib library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-glib-doc-0.13.10.0-1.3.noarch.rpm"
RPM_HASH = "210955b20d18b1a1aa49ed3bd3495f337ed351c94c6f73a76475854cf5126e417d1792a16f1f5fa88ed7c23359fd49e76c2b8aea8962b27692c6dc8f6ffcc2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-glib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
