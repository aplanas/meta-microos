SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-doc-3.1.3-2.1.noarch.rpm"
RPM_HASH = "2b502e524e8783d79989256d07e65374eadfe4b06a61ecf8ba731c8dff8ef4141fbeac8d2a8983a2be5f95eebff82474c1bede726ff2b9145855f4e353f479b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
