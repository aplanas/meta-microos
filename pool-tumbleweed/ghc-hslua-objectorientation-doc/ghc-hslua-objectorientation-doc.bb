SUMMARY = "Haskell hslua-objectorientation library documentation"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-doc-2.3.0-1.4.noarch.rpm"
RPM_HASH = "cf3cdf792b8d615782b8e2685ecdf40ee11aab84fe7cc9679de215ee264698a6bbc49c1c4b91b7f54551985a26d40ef697a5e7a429812053ba71698d1f290eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
