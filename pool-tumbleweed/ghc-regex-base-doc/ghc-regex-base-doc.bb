SUMMARY = "Haskell regex-base library documentation"
DESCRIPTION = "This package provides the Haskell regex-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-doc-0.94.0.2-3.3.noarch.rpm"
RPM_HASH = "64447e5a8320c4a57143103614031b279967244bef377999030fa8474aae194bc8ec55164612f3ad1c4935138099e96461f9dee64252e7597f2bc21aa71f92eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-base-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
