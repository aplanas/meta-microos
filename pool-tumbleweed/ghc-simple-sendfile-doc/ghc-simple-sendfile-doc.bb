SUMMARY = "Haskell simple-sendfile library documentation"
DESCRIPTION = "This package provides the Haskell simple-sendfile library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.31"

RPM_NAME = "ghc-simple-sendfile-doc-0.2.31-1.1.noarch.rpm"
RPM_HASH = "cb3c109cd3adb354a2a8711be6f61b04c8bac8f6dfa90af7c37206d6c1334f28ae4f71021ff1a6121076f1486015c20259e71e2ae0b5cdda2050cccb818dadf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-simple-sendfile-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
