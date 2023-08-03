SUMMARY = "Documentation for texlive-antt"
DESCRIPTION = "This package includes the documentation for texlive-antt"
LICENSE = "LPPL-1.3c"

PV = "2023.209.2.08svn18651"

RPM_NAME = "texlive-antt-doc-2023.209.2.08svn18651-55.1.noarch.rpm"
RPM_HASH = "148b9cda45672e76e377f4b95963b04ac5ffd6dc4152f0bc4c81b8bcef5ec54f44984b1dba31e467424e1f3033715c571bd327f43562c16fed86b9bb210be595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-antt-doc-en;pl \
texlive-antt-doc"

RDEPENDS:${PN} += ""

inherit rpm
