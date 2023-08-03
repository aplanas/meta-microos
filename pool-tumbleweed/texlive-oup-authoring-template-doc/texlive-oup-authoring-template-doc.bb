SUMMARY = "Documentation for texlive-oup-authoring-template"
DESCRIPTION = "This package includes the documentation for texlive-oup-authoring-template"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64491"

RPM_NAME = "texlive-oup-authoring-template-doc-2023.209.1.1svn64491-55.1.noarch.rpm"
RPM_HASH = "69743470114b3ee7f0108a985817a6d5ea97fe7f216726e981632cbfc814d8b9623cb4e8d016ef65c836225b8490e0bbfe9ab598d7b74d2481eb25b4f6d33aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oup-authoring-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
