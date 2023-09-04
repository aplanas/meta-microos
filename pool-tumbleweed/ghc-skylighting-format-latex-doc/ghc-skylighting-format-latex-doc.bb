SUMMARY = "Haskell skylighting-format-latex library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-doc-0.1-2.10.noarch.rpm"
RPM_HASH = "fdb6c763651c831bcd7a9170f6230c5ea2e1600af72915d443393fb685b5287892dd1fc73f0d6620d6d2de0e170ea977897d14811927668186d1bc03f3b77ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-latex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
