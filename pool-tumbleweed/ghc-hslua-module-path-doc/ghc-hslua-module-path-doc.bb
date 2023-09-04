SUMMARY = "Haskell hslua-module-path library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-path library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-doc-1.1.0-1.3.noarch.rpm"
RPM_HASH = "3fe5ee05380aed5868b85ece2c4321eb86ddc16aa7b202ea25a45640c16b1f6372e35c71bd8f909483cb69d8fe377d3d1adef3deabe76c95b02bc63cb66eebb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-path-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
