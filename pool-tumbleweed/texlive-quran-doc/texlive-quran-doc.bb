SUMMARY = "Documentation for texlive-quran"
DESCRIPTION = "This package includes the documentation for texlive-quran"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.81svn57601"

RPM_NAME = "texlive-quran-doc-2023.201.1.81svn57601-53.2.noarch.rpm"
RPM_HASH = "70da25588c7719f315be384633a6a9fa1330c26502b1cca5aec477e80f421dff72a4297f55f3c8f9cfb2c818e9308d573721fa9672fbbdafb47dc265fa5b3df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-doc"

RDEPENDS:${PN} += ""

inherit rpm
