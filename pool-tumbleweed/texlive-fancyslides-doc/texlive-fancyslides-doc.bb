SUMMARY = "Documentation for texlive-fancyslides"
DESCRIPTION = "This package includes the documentation for texlive-fancyslides"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36263"

RPM_NAME = "texlive-fancyslides-doc-2023.209.1.0svn36263-53.1.noarch.rpm"
RPM_HASH = "1fe6dfc5b1b4648afb566cd166b582c2cd76fa4d19df553badf5d9a10955bf862dec1225049e8d18328d8d2254ef13669bc588598ab948eb6ea45840b36a13e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
