SUMMARY = "Haskell ansi-wl-pprint library documentation"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-doc-0.6.9-11.2.noarch.rpm"
RPM_HASH = "559f65b6132b34823b535a254fd100ef2f3c2771c751c965c2ed12bc65546a01f4b500925599f8f953f69054d864a7e3059bcfc1f2d955b800ac52298afe1dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
