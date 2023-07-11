SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-doc-0.1.0.1-1.1.noarch.rpm"
RPM_HASH = "9352653311f66a92a280c0d524852bdddabfcf46ca292b73279b2786f74f977ea4dc4a0010a47a7997e26ecf8fb2912df832de36aca1c533917b7c2ef8b5d7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
