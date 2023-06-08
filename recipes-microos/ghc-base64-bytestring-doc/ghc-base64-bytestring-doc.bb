SUMMARY = "Haskell base64-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base64-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-doc-1.2.1.0-2.3.noarch.rpm"
RPM_HASH = "e523d9aa93f3d52a99a1ac49275093926609aa5b623eac9d4fb13b6a5f21d68a56b4dde2de4e25924ac82ffe42d82cb2ed74653a738dad55be8966ee628b7f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-bytestring-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
