SUMMARY = "Haskell stm library documentation"
DESCRIPTION = "This package provides the Haskell stm library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-doc-2.5.1.0-3.2.noarch.rpm"
RPM_HASH = "40b2a501a8e91ee117cbdf8398b47a7f36b17691c42814c9ee70c38998ea29a70d9b44ab8b7fcfb9d9f70405510c93110fb21671ce2be0bcf08e7df22e8779da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
