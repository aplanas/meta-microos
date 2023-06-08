SUMMARY = "Haskell hslua-core library documentation"
DESCRIPTION = "This package provides the Haskell hslua-core library documentation."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-doc-2.3.1-1.3.noarch.rpm"
RPM_HASH = "c76560f26279c5eca345256b7a70324c556832b438810247fdcaa3514a4ca68aa945730e08b8596cbf493c2da4371dc5434389911c0e8e651ca535cb294df221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-core-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
