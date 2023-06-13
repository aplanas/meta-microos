SUMMARY = "Haskell config-ini library documentation"
DESCRIPTION = "This package provides the Haskell config-ini library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.0"

RPM_NAME = "ghc-config-ini-doc-0.2.5.0-3.3.noarch.rpm"
RPM_HASH = "16d8d2cb13cf95d32e66042550d2633b243dceae6403994b5390b446b4022eab336abd39bc8a4cd8fc73cc2d6af64fe6f7b64fd43e9d3b4ef56182f408c424c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-config-ini-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
