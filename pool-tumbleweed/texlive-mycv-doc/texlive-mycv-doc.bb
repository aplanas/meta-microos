SUMMARY = "Documentation for texlive-mycv"
DESCRIPTION = "This package includes the documentation for texlive-mycv"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.6svn26807"

RPM_NAME = "texlive-mycv-doc-2023.209.1.5.6svn26807-55.1.noarch.rpm"
RPM_HASH = "f2a8114481192348233ac781d73f860008ba8caab73a55aaeb63b9944833005be36a8cff2661d25c7a790d96efbfe3fb3ad16189b4b7de00daa896ba917634c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mycv-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
