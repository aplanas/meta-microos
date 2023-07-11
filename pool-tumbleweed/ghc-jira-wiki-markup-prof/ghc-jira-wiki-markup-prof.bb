SUMMARY = "Haskell jira-wiki-markup profiling library"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup profiling library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-prof-1.5.1-1.6.aarch64.rpm"
RPM_HASH = "dbe49b81cbe6e971d44e637ba231f86e524984f374064bdc8d554cf1b95e338ea2b592a3d8423fb68918a251e6f3635eeb8895ff7060645c6be1ab750a884433"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-prof \
ghc-prof-jira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH"

RDEPENDS:${PN} += "ghc-jira-wiki-markup-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
