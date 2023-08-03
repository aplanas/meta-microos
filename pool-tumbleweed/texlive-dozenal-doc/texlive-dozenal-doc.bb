SUMMARY = "Documentation for texlive-dozenal"
DESCRIPTION = "This package includes the documentation for texlive-dozenal"
LICENSE = "LPPL-1.0"

PV = "2023.209.7.2svn47680"

RPM_NAME = "texlive-dozenal-doc-2023.209.7.2svn47680-53.1.noarch.rpm"
RPM_HASH = "881ce3eadf450e919e1b6cbffc65331332ee54faa92146bd99adbcf394ac920cc1b362e4df3ec230d036e65c6c95d8de28990b07420f17fecbb44c46dc1e5a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dozenal-doc"

RDEPENDS:${PN} += ""

inherit rpm
