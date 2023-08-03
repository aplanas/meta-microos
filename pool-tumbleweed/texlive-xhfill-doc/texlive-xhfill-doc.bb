SUMMARY = "Documentation for texlive-xhfill"
DESCRIPTION = "This package includes the documentation for texlive-xhfill"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn22575"

RPM_NAME = "texlive-xhfill-doc-2023.209.1.01svn22575-53.1.noarch.rpm"
RPM_HASH = "2fcfce6ad267c990c99d3c42ed45480c408213adc0cc36e78b4c5cf1e4d8c498c1b09a236383e872aec435608373c72cb8932b635a3f383839a4e0f3f68feede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xhfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
