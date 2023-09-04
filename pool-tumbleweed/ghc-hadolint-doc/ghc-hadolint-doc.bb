SUMMARY = "Haskell hadolint library documentation"
DESCRIPTION = "This package provides the Haskell hadolint library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-doc-2.12.0-1.14.noarch.rpm"
RPM_HASH = "3faa80e4fcd6def002f21899c9835de402be31cfdebd398a1ca9d43e46c87101f772d07f6f9477e2ee01dbd1d62eb9a8d876d89252aeae546385f43b6171902a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hadolint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
