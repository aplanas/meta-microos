SUMMARY = "Haskell jira-wiki-markup profiling library"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup profiling library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-prof-1.5.1-1.8.aarch64.rpm"
RPM_HASH = "e6b171ba6d9465f6007e89c5336cd4f30a0ec54f4a3e428d2a68e03252df663bbc4a74c2fa1534ca5e2cfe0208fcc02575b9cb3481978ed7f45f7558f3df1230"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-prof \
ghc-prof-jira-wiki-markup-1.5.1-Kpl2oQNac464TohGq5hnAO"

RDEPENDS:${PN} += "ghc-jira-wiki-markup-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
