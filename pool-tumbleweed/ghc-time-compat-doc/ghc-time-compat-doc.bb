SUMMARY = "Haskell time-compat library documentation"
DESCRIPTION = "This package provides the Haskell time-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-doc-1.9.6.1-5.9.noarch.rpm"
RPM_HASH = "89138ec70ce47b90d46718b4cf4db87316e422c73d8423e2367914fb780e9815ff7265d3fb66b124073348682017241dbaef1bf9eaf9709d4ac7796146a2fca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
