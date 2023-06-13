SUMMARY = "Documentation for texlive-xeindex"
DESCRIPTION = "This package includes the documentation for texlive-xeindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-doc-2023.201.0.0.3svn35756-52.1.noarch.rpm"
RPM_HASH = "ab37a725c852ffea5572d1d78288c222506b23cf8548400a1c3ce39e563bdc57b48a8d80f5e6e11b9a9278a6456aa0c5bfe8d5146180845709ab404b40ee2664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xeindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
