SUMMARY = "Haskell gtk2hs-buildtools library documentation"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library documentation."
LICENSE = "GPL-2.0-only"

PV = "0.13.8.3"

RPM_NAME = "ghc-gtk2hs-buildtools-doc-0.13.8.3-2.3.noarch.rpm"
RPM_HASH = "7aadf553a207acf23942169aaf0db395ec825405c809f9054d11d3921d68ac39d8f957885096bd928e9d20d1db33b0eacb62d6eb2200b9a1571d228166a11dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
