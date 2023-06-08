SUMMARY = "Haskell prettyprinter-ansi-terminal library documentation"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-doc-1.1.3-2.2.noarch.rpm"
RPM_HASH = "aa592318caeae7a19ee1e781e9eda0f140a07150d95735178ec3059648a16622b8f8f12cd8157c83fafdc0eb9236631d4ee1c83a7e4def961581fb7792fb0b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
