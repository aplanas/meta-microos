SUMMARY = "Haskell pango library documentation"
DESCRIPTION = "This package provides the Haskell pango library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-pango-doc-0.13.10.0-1.6.noarch.rpm"
RPM_HASH = "161531fe863b41c979c0a3367affd38fb64dc88988ebbb872b6984326192852394e0579d7b8614833ab970a1334dd2e0c2a8b1739d9ef6dd9f69933a1dedfcf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pango-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
