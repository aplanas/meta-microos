SUMMARY = "Haskell time-locale-compat library documentation"
DESCRIPTION = "This package provides the Haskell time-locale-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-doc-0.1.1.5-7.3.noarch.rpm"
RPM_HASH = "86bddb1362ae3c93a906579d80fe60e1dd67965347687cd156663b652759f966b235bc9d61dd5743ff7fafd8ea21e0ca16bf2a509ebc2f68a8f4100b85a042d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-locale-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
