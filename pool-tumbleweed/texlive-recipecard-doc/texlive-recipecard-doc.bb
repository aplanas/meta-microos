SUMMARY = "Documentation for texlive-recipecard"
DESCRIPTION = "This package includes the documentation for texlive-recipecard"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-recipecard-doc-2023.209.2.0svn15878-54.2.noarch.rpm"
RPM_HASH = "a3f80592b927f2d25295aff0dfd2c1dc05798401adec9049b9d2f4ed63c1fdab3ae9d22fd83a8369132965de87ec9f2228c83d98a8407f56d601203d6aaa8ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipecard-doc"

RDEPENDS:${PN} += ""

inherit rpm
