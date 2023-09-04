SUMMARY = "Haskell regex-tdfa library documentation"
DESCRIPTION = "This package provides the Haskell regex-tdfa library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.2"

RPM_NAME = "ghc-regex-tdfa-doc-1.3.2.2-1.3.noarch.rpm"
RPM_HASH = "c42a00d50e7f4b8a2f21bb5e0e750369131b8fdacaf4d5264c08b2f17c20eb6e654e1caadda324c7976a7b48ad595ca33d8453ac997527a73d8d85a67dc201a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-tdfa-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
