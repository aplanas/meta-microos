SUMMARY = "Documentation for texlive-historische-zeitschrift"
DESCRIPTION = "This package includes the documentation for texlive-historische-zeitschrift"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-doc-2023.209.1.2svn42635-54.2.noarch.rpm"
RPM_HASH = "414ea52a34d80cbfec98145d38109fd338f9831186483aa69667144d7229f417f94b12b0eb95fda827e670645f5441d846665d1ebc3cc8c484a8269d8eb09f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-historische-zeitschrift-doc-de;en \
texlive-historische-zeitschrift-doc"

RDEPENDS:${PN} += ""

inherit rpm
