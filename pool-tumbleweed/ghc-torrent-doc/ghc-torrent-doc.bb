SUMMARY = "Haskell torrent library documentation"
DESCRIPTION = "This package provides the Haskell torrent library documentation."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-doc-10000.1.3-1.3.noarch.rpm"
RPM_HASH = "78c1b1cdbbc354d702274199aae4e90610a5a9ebfe791c38d57ce29b00667ac682b48a5304317fe429dff38e8b957d675a51b88b864aa7126e6d3c796ec28793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-torrent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
