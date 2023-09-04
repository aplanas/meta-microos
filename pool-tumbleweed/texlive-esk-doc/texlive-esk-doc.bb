SUMMARY = "Documentation for texlive-esk"
DESCRIPTION = "This package includes the documentation for texlive-esk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn18115"

RPM_NAME = "texlive-esk-doc-2023.209.1.0svn18115-54.2.noarch.rpm"
RPM_HASH = "998acfbc34dcdfd9fb93b51352baee4b31b119500914910b07fa4927fd0ce6e8e847bb79a87de8b5300c7ecf9550cbce77fea2e6a59b871f0cf167ae1d7a03f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esk-doc"

RDEPENDS:${PN} += ""

inherit rpm
