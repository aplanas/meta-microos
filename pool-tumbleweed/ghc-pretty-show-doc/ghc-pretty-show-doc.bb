SUMMARY = "Haskell pretty-show library documentation"
DESCRIPTION = "This package provides the Haskell pretty-show library documentation."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-doc-1.10-4.3.noarch.rpm"
RPM_HASH = "24ea4bf6d2b5be62513c7468dda6464b8821bc05e8e56faf84b18211681a5c5a1d1179859a31e6de0e6a89a94b0ee4ffdf2216cc029aa3879edff47b161b427b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-show-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
