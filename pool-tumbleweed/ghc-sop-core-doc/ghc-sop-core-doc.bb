SUMMARY = "Haskell sop-core library documentation"
DESCRIPTION = "This package provides the Haskell sop-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-doc-0.5.0.2-4.6.noarch.rpm"
RPM_HASH = "ae2baf77941c9664c731c241f111da5b2dc11339dfcfc277c8fa83c012a0cb0305347520ccf9cd185b5e99e2f956ba2294a84be493af3072913cd0acebdc53b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sop-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
