SUMMARY = "Documentation for texlive-cyrillic-bin"
DESCRIPTION = "This package includes the documentation for texlive-cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn62517"

RPM_NAME = "texlive-cyrillic-bin-doc-2023.204.svn62517-54.1.noarch.rpm"
RPM_HASH = "328a614e8c380fa1bc6608ad6492e0dd45613e862ee9ae2c3b538b3098016a2aeff297952823b1b3c50ffdcebcb3ee683508e99ecfa6e63ebd0f86214555b7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(rubibtex.1) \
man(rumakeindex.1) \
texlive-cyrillic-bin-doc"

RDEPENDS:${PN} += ""

inherit rpm
