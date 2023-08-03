SUMMARY = "Documentation for texlive-cyrillic"
DESCRIPTION = "This package includes the documentation for texlive-cyrillic"
LICENSE = "LPPL-1.0"

PV = "2023.209.20220601_pl1svn63613"

RPM_NAME = "texlive-cyrillic-doc-2023.209.20220601_pl1svn63613-55.1.noarch.rpm"
RPM_HASH = "3bf9f4bd9f96297ae83f01173275df1bd5f74fd97cbbd25db8bb8fa94974c9d99f5a9677db22b50a7155d897af0332acef94df49a09659de5f5ce1e29e5bb41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyrillic-doc"

RDEPENDS:${PN} += ""

inherit rpm
