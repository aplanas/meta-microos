SUMMARY = "Documentation for texlive-eczar"
DESCRIPTION = "This package includes the documentation for texlive-eczar"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.1svn57716"

RPM_NAME = "texlive-eczar-doc-2023.201.0.0.1svn57716-53.2.noarch.rpm"
RPM_HASH = "44cba146b1db863dc010974e2478883719820029cb94b421080ca7bd7a4b0f46c3ff18bf24f942cad8311b62df745d940f76f0b7b53144294e57a98521f98ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar-doc"

RDEPENDS:${PN} += ""

inherit rpm
