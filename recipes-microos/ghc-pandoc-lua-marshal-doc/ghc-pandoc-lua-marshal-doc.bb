SUMMARY = "Haskell pandoc-lua-marshal library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library documentation."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-doc-0.2.2-1.4.noarch.rpm"
RPM_HASH = "298d218b6e7a0429d0c0a9237eee6d87fe78e352da3e1954cbc885df09d86066bbc01879e5e61f381a7bf71b471a425eda681c011e25b63ca905c8f3f08165b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
