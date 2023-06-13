SUMMARY = "Documentation for texlive-hustthesis"
DESCRIPTION = "This package includes the documentation for texlive-hustthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn42547"

RPM_NAME = "texlive-hustthesis-doc-2023.201.1.4svn42547-52.1.noarch.rpm"
RPM_HASH = "c0864c9536732705a9f6319f54ca7d5688110c6e8074d9b4e2f32349b62dbc95f56e5e4fb6277a213935d8f9f48982f63b8ad32fd25bce3742ab03811c1a384f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hustthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
