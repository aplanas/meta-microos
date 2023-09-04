SUMMARY = "Haskell hslua-module-zip library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-zip library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-zip-doc-1.1.0-1.3.noarch.rpm"
RPM_HASH = "31a194b41dfa4f8a54fb290fbc65360e13bd996947bb0a82a85fb26f1da549a6015c4342fe00c626d6c8602a79a4175faa77404b13f13eb05f8acf0667906b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-zip-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
