SUMMARY = "Documentation for texlive-poormanlog"
DESCRIPTION = "This package includes the documentation for texlive-poormanlog"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07svn63400"

RPM_NAME = "texlive-poormanlog-doc-2023.209.0.0.07svn63400-53.1.noarch.rpm"
RPM_HASH = "d665aebd06af732bb3db006f68034b53e389a20b8aeba6905a83e55f1b4fa054e612ac642060319a258014b3721d1513d643a43dd8d8e229d73bea7f455dffd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poormanlog-doc"

RDEPENDS:${PN} += ""

inherit rpm
