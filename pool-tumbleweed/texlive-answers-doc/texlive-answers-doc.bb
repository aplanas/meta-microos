SUMMARY = "Documentation for texlive-answers"
DESCRIPTION = "This package includes the documentation for texlive-answers"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.16svn35032"

RPM_NAME = "texlive-answers-doc-2023.201.2.16svn35032-54.1.noarch.rpm"
RPM_HASH = "e938fdf8e70a13fb335a3173a4c33f37c57bc25228038502b670175110f78d04dcd2ea87cad8273adcccc3cc53739ff371fe82b0929a9927b891746b59539e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-answers-doc"

RDEPENDS:${PN} += ""

inherit rpm
