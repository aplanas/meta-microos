SUMMARY = "Haskell adjunctions library documentation"
DESCRIPTION = "This package provides the Haskell adjunctions library documentation."
LICENSE = "BSD-2-Clause"

PV = "4.4.2"

RPM_NAME = "ghc-adjunctions-doc-4.4.2-2.9.noarch.rpm"
RPM_HASH = "2cf69710195ea25297ebab9ad8bef99087aeec8bcfbbae99bdb24181fa850adceeb0a76ccea447e257b3539f2f7b2c9124ca2b8e5daffbf3e37e086318c6bf15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-adjunctions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
