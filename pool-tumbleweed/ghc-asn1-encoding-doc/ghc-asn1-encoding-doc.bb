SUMMARY = "Haskell asn1-encoding library documentation"
DESCRIPTION = "This package provides the Haskell asn1-encoding library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-doc-0.9.6-8.6.noarch.rpm"
RPM_HASH = "62854fe4874e989ed567987d49cbbb1f177081461944ae2d3a58ff6e82dcc427cf269aada4dd73c0c65e250a726120ef0296f37c2f441960ae07c2e27cf9a2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-encoding-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
