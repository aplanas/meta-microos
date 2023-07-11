SUMMARY = "Haskell optics-core library documentation"
DESCRIPTION = "This package provides the Haskell optics-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-doc-0.4.1.1-1.2.noarch.rpm"
RPM_HASH = "acaa478fdbff95cb12c35e3779e370aca4efb2e2f76909706a3450ddd8b050b9eee096dc25ec293cde367f6980cdb597bc86ca64f1ab141865c2cd751457d074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optics-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
