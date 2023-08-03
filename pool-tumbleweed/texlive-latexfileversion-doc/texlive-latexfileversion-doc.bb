SUMMARY = "Documentation for texlive-latexfileversion"
DESCRIPTION = "This package includes the documentation for texlive-latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn29349"

RPM_NAME = "texlive-latexfileversion-doc-2023.209.0.0.3svn29349-55.1.noarch.rpm"
RPM_HASH = "92dc71009a5b403f45ec3753652d2bbfad7f6162f842d8adca5df0e507a10e13b95f843e423d24f5c400840d162f1a18d37350a50facb245993e9addd7cbf736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
