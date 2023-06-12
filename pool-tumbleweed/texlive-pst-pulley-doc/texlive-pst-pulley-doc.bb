SUMMARY = "Documentation for texlive-pst-pulley"
DESCRIPTION = "This package includes the documentation for texlive-pst-pulley"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-doc-2023.201.0.0.02svn62977-53.1.noarch.rpm"
RPM_HASH = "fce4b1c7682354e9ab8f7d43e413bb6b585efb18484068b437567cbb4b45f07244dcd3b2bff8289957060a5affc0c55599891dd37a15bedc8841c934758ab52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pulley-doc"
RDEPENDS:${PN} += ""

inherit rpm
