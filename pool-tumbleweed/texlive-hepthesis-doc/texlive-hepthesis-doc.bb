SUMMARY = "Documentation for texlive-hepthesis"
DESCRIPTION = "This package includes the documentation for texlive-hepthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2svn46054"

RPM_NAME = "texlive-hepthesis-doc-2023.209.1.5.2svn46054-54.2.noarch.rpm"
RPM_HASH = "b7aaafbfaec4b65b824485d2ec05b929bd4fa1e072b7bcd3fb74020b4dcf89d71bd5a7f7544e69185444c77aea2983f3b6981f6f167b0c6bdd0cd5568bb45ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepthesis-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
