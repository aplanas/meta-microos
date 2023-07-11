SUMMARY = "Haskell gtk2hs-buildtools library documentation"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library documentation."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-gtk2hs-buildtools-doc-0.13.10.0-1.3.noarch.rpm"
RPM_HASH = "df102ca918f34e8ffb5f1c152341066693bbae4be0c4becb38f62859b4d1d60e754f9e14929e8ffd586c740284b84f7100ebd039ad3f7642a172524a94205f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
