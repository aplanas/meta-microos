SUMMARY = "Documentation for texlive-epstopdf-pkg"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-doc-2023.209.2.11svn53546-54.1.noarch.rpm"
RPM_HASH = "ae972c0fed28958462bfd2ce7506b92051d098a069ececbc4996a03b3c033340430a84a207180012965ec80e769653aa9d1b1e662e377ae0561a30bad9b84a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
