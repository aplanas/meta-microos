SUMMARY = "Documentation for texlive-arsclassica"
DESCRIPTION = "This package includes the documentation for texlive-arsclassica"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45656"

RPM_NAME = "texlive-arsclassica-doc-2023.209.svn45656-54.1.noarch.rpm"
RPM_HASH = "f711e67d962dfe63107ea06b94322b8b2bb7a352287e14204fd3525a4249f99c198c79179b31818d47db6a4267b5e0a77329729593500603a98b0d6f07ff7da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-arsclassica-doc-en \
texlive-arsclassica-doc"

RDEPENDS:${PN} += ""

inherit rpm
