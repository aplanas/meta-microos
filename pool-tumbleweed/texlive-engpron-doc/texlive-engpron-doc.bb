SUMMARY = "Documentation for texlive-engpron"
DESCRIPTION = "This package includes the documentation for texlive-engpron"
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn16558"

RPM_NAME = "texlive-engpron-doc-2023.209.2svn16558-54.1.noarch.rpm"
RPM_HASH = "969a5b8b9879cad45732b7cec254538336d876f12753c55ecda92cd44acd11eac856522f0f7a7446c972cb7c6af883d34a1461a65dfd5901edcc0268a2b249ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engpron-doc-fr;en \
texlive-engpron-doc"

RDEPENDS:${PN} += ""

inherit rpm
