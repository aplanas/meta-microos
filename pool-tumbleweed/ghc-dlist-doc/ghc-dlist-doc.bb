SUMMARY = "Haskell dlist library documentation"
DESCRIPTION = "This package provides the Haskell dlist library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-doc-1.0-3.3.noarch.rpm"
RPM_HASH = "a29ff577ff2e55fa276ca1c2d66df26e785b13179782602e913dce33e4879dd0e3fc87605c6beefcdd4455d795cacbad82045ef52e95a5799724250e1bd683c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dlist-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
