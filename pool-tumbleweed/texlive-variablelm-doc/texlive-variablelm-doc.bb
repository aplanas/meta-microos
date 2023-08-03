SUMMARY = "Documentation for texlive-variablelm"
DESCRIPTION = "This package includes the documentation for texlive-variablelm"
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.2svn60014"

RPM_NAME = "texlive-variablelm-doc-2023.209.1.2svn60014-54.1.noarch.rpm"
RPM_HASH = "38596ed81eda105b743caad24800cdec4f26507c65659786644ed3c1ec21615bf39687994c1862b3258d354e68900491ad477af7b2b7bfa1a904039fdfce4afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-variablelm-doc"

RDEPENDS:${PN} += ""

inherit rpm
