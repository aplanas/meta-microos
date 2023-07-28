SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.2.0.1-1.6.noarch.rpm"
RPM_HASH = "851cd7d5814c075cd7cdb9128c16afd8c1ab1a310df65c34c49e656734a056214d0ff2d20b63540e5ba58f1c846f639394ddb7741c3ef0e41c1eab40230c3026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
