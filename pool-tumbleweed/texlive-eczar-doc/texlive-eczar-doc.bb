SUMMARY = "Documentation for texlive-eczar"
DESCRIPTION = "This package includes the documentation for texlive-eczar"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.1svn57716"

RPM_NAME = "texlive-eczar-doc-2023.209.0.0.1svn57716-54.2.noarch.rpm"
RPM_HASH = "96a6dc593cf834b3a1d91f3d2a1d33711b31b84b5feafafbb14ddd52a722a13f8fa36b387c539161b5bebc3a8f9f8373c9706ecbf2d0290dee3c250cb415367c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar-doc"

RDEPENDS:${PN} += ""

inherit rpm
