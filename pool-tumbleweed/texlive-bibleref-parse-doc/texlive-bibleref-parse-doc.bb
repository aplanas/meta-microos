SUMMARY = "Documentation for texlive-bibleref-parse"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-parse"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn22054"

RPM_NAME = "texlive-bibleref-parse-doc-2023.209.1.1svn22054-54.1.noarch.rpm"
RPM_HASH = "54d3605d67927df1faacd583112306c87fb4050647f00b5886479427773c517c74e1372f3df1ec74b52b792593b49528fed2dd730e8d37de631f41e682daf905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-parse-doc"

RDEPENDS:${PN} += ""

inherit rpm
