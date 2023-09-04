SUMMARY = "Haskell securemem library documentation"
DESCRIPTION = "This package provides the Haskell securemem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-doc-0.1.10-4.5.noarch.rpm"
RPM_HASH = "e9866f7a55bf9b8199743cd36e3dddcccfcde64968a6a0f9c7b783eab646ade276a4d19b5eed71366e2812e07d967525b84b8f915837451b5688f8b853d0437a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-securemem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
