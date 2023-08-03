SUMMARY = "Documentation for texlive-fonts-tlwg"
DESCRIPTION = "This package includes the documentation for texlive-fonts-tlwg"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7.3svn60817"

RPM_NAME = "texlive-fonts-tlwg-doc-2023.209.0.0.7.3svn60817-53.1.noarch.rpm"
RPM_HASH = "39dc19ea702f78f0279a02afabf41c3c69bcaa0a3756fb8b3b6c163dfdbdd9efaeb54f868ac9c8443829f1175d4c8d4f373a906bbda4d74e8149ccc4ee11f395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-tlwg-doc"

RDEPENDS:${PN} += ""

inherit rpm
