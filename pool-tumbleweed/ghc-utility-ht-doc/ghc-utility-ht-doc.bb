SUMMARY = "Haskell utility-ht library documentation"
DESCRIPTION = "This package provides the Haskell utility-ht library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.17"

RPM_NAME = "ghc-utility-ht-doc-0.0.17-1.5.noarch.rpm"
RPM_HASH = "841bd67a280a138a5d54513e5109864a8c2822f9810be92a75f930c90952de7e89a8009a6e28321316065d3d98ed850d1e66ad0f12598e554aa7c9d7592c241e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utility-ht-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
