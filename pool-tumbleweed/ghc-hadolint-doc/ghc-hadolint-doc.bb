SUMMARY = "Haskell hadolint library documentation"
DESCRIPTION = "This package provides the Haskell hadolint library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-doc-2.12.0-1.5.noarch.rpm"
RPM_HASH = "b5a12e41858420b7847b86bea45cccf750aaae69fe2532043f7b3b5fd16442c8d6d5b9461bf25ddb2e8f10e4face12cf66f8abd1eeb7959523aa417b261a5b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hadolint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
