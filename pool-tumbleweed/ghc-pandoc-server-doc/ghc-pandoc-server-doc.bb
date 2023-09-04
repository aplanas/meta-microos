SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.2"

RPM_NAME = "ghc-pandoc-server-doc-0.1.0.2-1.2.noarch.rpm"
RPM_HASH = "96f8d0d9090a64ef8b4394125ef6606ef4cd4127c6e4e0e9371f7fba4dff6331010e1efaad1e07a34d33cb2a84c34774e2a7a8885bc3a718e049223091511a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
