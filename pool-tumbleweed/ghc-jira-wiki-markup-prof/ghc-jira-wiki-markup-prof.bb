SUMMARY = "Haskell jira-wiki-markup profiling library"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup profiling library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-prof-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "52f0d86ef5e1d7a1c77b310fb8a1c55d404e2b2e715f11495d1dacd3971ddc9da22b7b2b394d25d7b35b82db132da9318826b08cb77d85f442f5329165b1ce96"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-prof \
ghc-prof-jira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH"

RDEPENDS:${PN} += "ghc-jira-wiki-markup-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
