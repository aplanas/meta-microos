SUMMARY = "Haskell emojis library documentation"
DESCRIPTION = "This package provides the Haskell emojis library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-emojis-doc-0.1.3-1.2.noarch.rpm"
RPM_HASH = "e359ea2fa7ff3d5b7209a3bb0ebdb0c3ebc38317acf70672ca4b7fb3a4775b2475aa4aef957d34ed1c44197c15a1ffb08765965926c352da90bb067a5ebcbc45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-emojis-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
