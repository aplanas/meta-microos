SUMMARY = "Documentation for texlive-highlightlatex"
DESCRIPTION = "This package includes the documentation for texlive-highlightlatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58392"

RPM_NAME = "texlive-highlightlatex-doc-2023.209.svn58392-54.1.noarch.rpm"
RPM_HASH = "5568b5aea5e348f06ebaf40431372688443c6ec702fbf10bf6d5b094e460fdef1f5c848625d2cc783dbf240a58735337eded7a18027e3ec8ab2b4af44dc00e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-highlightlatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
