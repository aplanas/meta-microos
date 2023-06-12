SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.2-1.3.noarch.rpm"
RPM_HASH = "ce8f6ed3851819811ad01629cc648d24445c0ccdb490c96617ad5cea65595bdb710331bc5a6ec2055af791804ef3150d4ab597c146a1493d3b68db2b20ea90e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
