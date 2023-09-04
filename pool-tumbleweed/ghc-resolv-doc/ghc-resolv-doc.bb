SUMMARY = "Haskell resolv library documentation"
DESCRIPTION = "This package provides the Haskell resolv library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-doc-0.1.2.0-10.8.noarch.rpm"
RPM_HASH = "bf4496ca84d1b6ccd25ea49ddf70f5c810720cfe9cb4fd3a11ae78f6d60cda59943dcff1537a70b845e58502182a86fcdf0abab2f54e09a00b0a530202776ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resolv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
