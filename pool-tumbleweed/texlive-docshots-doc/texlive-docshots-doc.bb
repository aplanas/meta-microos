SUMMARY = "Documentation for texlive-docshots"
DESCRIPTION = "This package includes the documentation for texlive-docshots"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn65141"

RPM_NAME = "texlive-docshots-doc-2023.209.0.0.4.0svn65141-53.1.noarch.rpm"
RPM_HASH = "64c4bd569f47ce04c66e417e84e378f7f9962952216290633e6531bfc7f6c0ee7d9d5e52654475405271da8c78ab97066078734328a9dca2801f26c8d730af82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docshots-doc"

RDEPENDS:${PN} += ""

inherit rpm
