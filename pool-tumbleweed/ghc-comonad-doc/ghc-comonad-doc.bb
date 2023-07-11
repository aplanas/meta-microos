SUMMARY = "Haskell comonad library documentation"
DESCRIPTION = "This package provides the Haskell comonad library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-doc-5.0.8-3.6.noarch.rpm"
RPM_HASH = "08acc109b1a1ff91dd209e19823e56e52b60deb2034c379eda5f13d3910b0f18497e08d49221b9b1ab75d975a603faef0875bb8ea4d605c93f8ab1118fdd5fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-comonad-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
