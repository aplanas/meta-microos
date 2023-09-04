SUMMARY = "Haskell kan-extensions library documentation"
DESCRIPTION = "This package provides the Haskell kan-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-doc-5.2.5-2.9.noarch.rpm"
RPM_HASH = "4b3f915459ce737f07ea93675bb8be0360985e814fd76465cb650ce333ff9a63d31e54262904247f3c90c79f916cdb86e2f0e24ddfd2f47c32f2a7ebc53d31de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-kan-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
