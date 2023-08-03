SUMMARY = "Documentation for texlive-fifinddo-info"
DESCRIPTION = "This package includes the documentation for texlive-fifinddo-info"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn29349"

RPM_NAME = "texlive-fifinddo-info-doc-2023.209.1.1bsvn29349-53.1.noarch.rpm"
RPM_HASH = "4c42b4cd1eaf9eeddd7c2070dfed48e9239021bf4951afe566b15cc9298a7c753b9614d82713bfb841bbe40a4cbe3401c48fca1620e4a9ae0f13b2cb0837bb73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fifinddo-info-doc-de;en \
texlive-fifinddo-info-doc"

RDEPENDS:${PN} += ""

inherit rpm
