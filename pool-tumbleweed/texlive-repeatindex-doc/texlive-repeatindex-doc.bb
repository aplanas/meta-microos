SUMMARY = "Documentation for texlive-repeatindex"
DESCRIPTION = "This package includes the documentation for texlive-repeatindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-doc-2023.209.0.0.01svn24305-54.1.noarch.rpm"
RPM_HASH = "f3027679c0fbf2afee77c957960812c5ccf07179ab37e624062e1c07ed2d39e186c56f7af0d8cbce0cee8431f2e87f5ecb68a2e9618ad71b92f9920c69751a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repeatindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
