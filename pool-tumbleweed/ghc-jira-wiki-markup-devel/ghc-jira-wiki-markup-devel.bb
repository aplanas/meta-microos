SUMMARY = "Haskell jira-wiki-markup library development files"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library development \
files."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-devel-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "4b823d55402a4f170888f16effe98e4d4cd8c78da8d8f9df42b6de7aa83a0fe71fbfb568e530bc4221d1fe76c23199c0857d86ed9d809d817ef39a27f07201d9"

RPROVIDES:${PN} += "ghc-devel(jira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH) \
ghc-jira-wiki-markup-devel \
ghc-jira-wiki-markup-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(mtl-2.2.2) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(text-2.0.2) \
ghc-jira-wiki-markup"

inherit rpm
