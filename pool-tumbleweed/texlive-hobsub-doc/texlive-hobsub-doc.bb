SUMMARY = "Documentation for texlive-hobsub"
DESCRIPTION = "This package includes the documentation for texlive-hobsub"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52810"

RPM_NAME = "texlive-hobsub-doc-2023.201.svn52810-53.1.noarch.rpm"
RPM_HASH = "6fcc670f5827960fe23745c094374e098697da30cd660b6884e61e987ae43ca6cf9d3578c121676d7def642542b519df7f4acf1b775ca1d1701e8c68c8f70f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobsub-doc"

RDEPENDS:${PN} += ""

inherit rpm
