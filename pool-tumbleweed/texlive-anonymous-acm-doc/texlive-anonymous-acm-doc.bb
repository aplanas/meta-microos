SUMMARY = "Documentation for texlive-anonymous-acm"
DESCRIPTION = "This package includes the documentation for texlive-anonymous-acm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55121"

RPM_NAME = "texlive-anonymous-acm-doc-2023.209.1.0svn55121-55.1.noarch.rpm"
RPM_HASH = "28c6a9c8059070cc1175d1583b92bd7944c1c67ff125365b57481d13508f1c0e8b9a4513c669c70e5754bb217bc78dd810396109eb73c18037a95dda14db8500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonymous-acm-doc"

RDEPENDS:${PN} += ""

inherit rpm
