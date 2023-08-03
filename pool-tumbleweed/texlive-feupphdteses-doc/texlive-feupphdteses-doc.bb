SUMMARY = "Documentation for texlive-feupphdteses"
DESCRIPTION = "This package includes the documentation for texlive-feupphdteses"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn30962"

RPM_NAME = "texlive-feupphdteses-doc-2023.209.4.0svn30962-53.1.noarch.rpm"
RPM_HASH = "778c1a00f2d9f86cc0c3164427523d803c24adf0e377b05f8eff0817323aaf8cfe29e711f7ca7180936f2ac3d8640b431ad68589c32a6a619b18337697558c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feupphdteses-doc"

RDEPENDS:${PN} += ""

inherit rpm
