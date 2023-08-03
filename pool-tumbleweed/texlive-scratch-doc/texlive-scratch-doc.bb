SUMMARY = "Documentation for texlive-scratch"
DESCRIPTION = "This package includes the documentation for texlive-scratch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn50073"

RPM_NAME = "texlive-scratch-doc-2023.209.0.0.41svn50073-54.1.noarch.rpm"
RPM_HASH = "94fb1afb0c44c89559baeae55df6ac29790940b07af7dc44d44ee020483ae9789c3f91c24ba2b2e3615a0f451cfd490489d96150b8b9f19fe2bdf12a3ccbb8f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scratch-doc-fr \
texlive-scratch-doc"

RDEPENDS:${PN} += ""

inherit rpm
