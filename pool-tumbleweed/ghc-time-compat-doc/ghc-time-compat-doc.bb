SUMMARY = "Haskell time-compat library documentation"
DESCRIPTION = "This package provides the Haskell time-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-doc-1.9.6.1-5.6.noarch.rpm"
RPM_HASH = "dd427350d22363b0c2f0d5191bf82b664798e407860be8393759f3151f61b630eaf8f2f8df36892b350f4d5a2e956b44ce208686869f0efb281e23e8cef74639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
