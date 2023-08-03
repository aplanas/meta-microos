SUMMARY = "Documentation for texlive-datetime2-spanish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn45785"

RPM_NAME = "texlive-datetime2-spanish-doc-2023.209.1.1svn45785-53.1.noarch.rpm"
RPM_HASH = "ed5d1ea648d970c046de88bb79bb998df009cfbb7b2169467b3f5d14e9e00dfe83bdcebce532ae2bdd48f6797b4d8219403601777217cb4a6b074358dffa4d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
