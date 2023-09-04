SUMMARY = "Haskell hslua-module-version library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-version library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-version-doc-1.1.0-1.3.noarch.rpm"
RPM_HASH = "3278aa60406fc63feb81540ff3de3313f8853ded9b7ea7401af5dd16723b9a02baf509632dcce36c041ac8d0480fb49d044e9c22802749294b28a36011769ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-version-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
