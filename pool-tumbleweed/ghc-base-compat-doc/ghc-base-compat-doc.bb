SUMMARY = "Haskell base-compat library documentation"
DESCRIPTION = "This package provides the Haskell base-compat library documentation."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-doc-0.12.2-2.3.noarch.rpm"
RPM_HASH = "9026aa6f2568ccc2931ce100cb6c8e4cb31f9941243449d53ea21a3377be7438e79a00e3704e89231c0265a472e06980b98171ad6c7194f14ac0c9f1311b4854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-compat-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
