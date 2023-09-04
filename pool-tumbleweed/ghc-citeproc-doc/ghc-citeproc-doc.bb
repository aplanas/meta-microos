SUMMARY = "Haskell citeproc library documentation"
DESCRIPTION = "This package provides the Haskell citeproc library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-doc-0.8.1-2.14.noarch.rpm"
RPM_HASH = "325ebbe54b1132a6a227a3b6a4e4c52351d407a514475e31996647ba72cb9fa9b73eb4f48a12bbe02e305afbc984bc42bd0cefd71e2757e15d727f8c6ac38e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-citeproc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
