SUMMARY = "Haskell skylighting library documentation"
DESCRIPTION = "This package provides the Haskell skylighting library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-doc-0.13.4.1-1.1.noarch.rpm"
RPM_HASH = "0a09b413aec489f12907853437447b1503fdedd38005fea12d3046cb53d0a8b977f7ceb6e08ea96c262c5437d6f1afa287a9af312131b8d77e677ee9f8565db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
