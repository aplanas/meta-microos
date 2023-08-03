SUMMARY = "Documentation for texlive-autopdf"
DESCRIPTION = "This package includes the documentation for texlive-autopdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32377"

RPM_NAME = "texlive-autopdf-doc-2023.209.1.1svn32377-54.1.noarch.rpm"
RPM_HASH = "0b15861c09e6802d4ea54d63bc87077bca34f02c27abdb9787b51f11a30948fa999e4b28494cb050d592c7c7af19246c20d101b550fe8b76c31acc5b6edc0bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
