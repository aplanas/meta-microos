SUMMARY = "Documentation for texlive-fontspec"
DESCRIPTION = "This package includes the documentation for texlive-fontspec"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8asvn63386"

RPM_NAME = "texlive-fontspec-doc-2023.209.2.8asvn63386-53.1.noarch.rpm"
RPM_HASH = "25f60613337c141e853caa963cb707121c4d5a386f6f2adbf0a41d6c92bc304dca827e8e0669a40e050e7e3b273648ea13595efe632db9d0b41d893ad272643e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontspec-doc"

RDEPENDS:${PN} += ""

inherit rpm
