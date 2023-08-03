SUMMARY = "Documentation for texlive-modiagram"
DESCRIPTION = "This package includes the documentation for texlive-modiagram"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn56886"

RPM_NAME = "texlive-modiagram-doc-2023.209.0.0.3asvn56886-55.1.noarch.rpm"
RPM_HASH = "8dbab4b834c4751c563973acec6ef99dd92ba3954b679f1d1e58e58537cace564dd54ee4e8d025e07c78deec2337c911795312b1c7dcc3a539a7468b0d72f45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-modiagram-doc-en \
texlive-modiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
