SUMMARY = "Haskell clock library documentation"
DESCRIPTION = "This package provides the Haskell clock library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "ghc-clock-doc-0.8.3-2.2.noarch.rpm"
RPM_HASH = "ddc591772e9be9df96f227c9bede7cfd1cf0219138b0e73f0c931e06b448afe83d0ca52315babb980f02e5fe22ba92bc8e5a0e1ccca596d01174a8e0fdfa7250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clock-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
