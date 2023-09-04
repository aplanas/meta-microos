SUMMARY = "Haskell hslua-core library documentation"
DESCRIPTION = "This package provides the Haskell hslua-core library documentation."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-doc-2.3.1-1.8.noarch.rpm"
RPM_HASH = "3d055bf936e275654f5983366e9317ac86f0d1c3e907abc29f79b68b17b6eec2e525c9c8668d07c0a787dac652ac03edc130365de513a981f7ef10653ef38e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
