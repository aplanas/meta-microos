SUMMARY = "Documentation for texlive-prodint"
DESCRIPTION = "This package includes the documentation for texlive-prodint"
LICENSE = "OFL-1.1"

PV = "2023.209.svn21893"

RPM_NAME = "texlive-prodint-doc-2023.209.svn21893-53.1.noarch.rpm"
RPM_HASH = "5ab589479e38007b846a4e671f38b795c76838d65c758cb5982770de6211626090d2eecc101dfcc53b465183379cd90d91259652022c67487fd479bd225cd277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prodint-doc"

RDEPENDS:${PN} += ""

inherit rpm
