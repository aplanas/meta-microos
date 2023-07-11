SUMMARY = "Haskell polyparse library documentation"
DESCRIPTION = "This package provides the Haskell polyparse library documentation."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-doc-1.13-10.6.noarch.rpm"
RPM_HASH = "85f3602675e6c184765454246279a039eacb0f22415d6499e25d138d310a4650a9b6b7a513bfcb9377f65128a9924e4f2e165b1690069aba76a996bbd83f45bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-polyparse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
