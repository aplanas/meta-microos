SUMMARY = "Haskell jira-wiki-markup library development files"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library development \
files."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-devel-1.5.1-1.6.aarch64.rpm"
RPM_HASH = "63aa532800530be83500e2e46770bf90776fd3e37f9cdd0f9762726b7acda3beecfbe34c0b0ac0dd6971698624b07f2a12a9b2af05d628f08554c41c9ff2d5b4"

RPROVIDES:${PN} += "ghc-devel-jira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH \
ghc-jira-wiki-markup-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-jira-wiki-markup"

inherit rpm
