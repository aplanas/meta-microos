SUMMARY = "Haskell clock library documentation"
DESCRIPTION = "This package provides the Haskell clock library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-doc-0.8.4-1.1.noarch.rpm"
RPM_HASH = "158ca183230e7f5e2172925b9423459efb4417ec946f4b56fc7c166d9010b7d59b6632a3792505be08cb94d9425479f839cef18e6052a24fd7a4737612ddf6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clock-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
