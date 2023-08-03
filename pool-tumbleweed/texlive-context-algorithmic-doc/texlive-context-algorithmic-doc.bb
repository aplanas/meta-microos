SUMMARY = "Documentation for texlive-context-algorithmic"
DESCRIPTION = "This package includes the documentation for texlive-context-algorithmic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-algorithmic-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "ed5791360dc316cf9fed03cebec902077d148dd75ccfa1b3826d1607e0c5e1aa6b8d46f648301cf8da4495e49747cc0bf0bf85b1be190964cd234dc544abd411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-algorithmic-doc"

RDEPENDS:${PN} += ""

inherit rpm
