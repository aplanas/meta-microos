SUMMARY = "Haskell semigroups library documentation"
DESCRIPTION = "This package provides the Haskell semigroups library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-doc-0.20-2.3.noarch.rpm"
RPM_HASH = "4d28449cd3df67225c9c620f904c0115d2d12798275db3e320bad87ee0a4a7d504405b96b7370b6130b48b5da340103bbfe399bf61cc7ae8ad5748ddd409cff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semigroups-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
