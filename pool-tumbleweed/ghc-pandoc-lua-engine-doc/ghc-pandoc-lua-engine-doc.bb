SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.2.0.1-1.3.noarch.rpm"
RPM_HASH = "d75035cb07f75d58c1af1192f9b4811740bea9eec1b069dc1ecebf3ded08de7fa5fc535b4a4da58f116229ff0c87f8ad95b41952007c1f6ee73042a15619ad64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
