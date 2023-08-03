SUMMARY = "Documentation for texlive-minim-xmp"
DESCRIPTION = "This package includes the documentation for texlive-minim-xmp"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-xmp-doc-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "475ae477e29938f95b867cec4f80ba314b093624b21aca740edfc78993c34f1a1e110bed36d5255a945d8d30297ce27f30c82f1516b706186d804c10c4c6d033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-xmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
