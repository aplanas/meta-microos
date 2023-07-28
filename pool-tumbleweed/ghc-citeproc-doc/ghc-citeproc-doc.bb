SUMMARY = "Haskell citeproc library documentation"
DESCRIPTION = "This package provides the Haskell citeproc library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-doc-0.8.1-2.8.noarch.rpm"
RPM_HASH = "63a0bde4cf14a248d1fe174d275aa03d6041aa3ab9d876547e2a9c116200163d325fb627d5fda67d9bd6f38cd373af65841aa6a300357b40d941643d4f3dd537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-citeproc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
