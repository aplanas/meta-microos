SUMMARY = "Documentation for texlive-precattl"
DESCRIPTION = "This package includes the documentation for texlive-precattl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63967"

RPM_NAME = "texlive-precattl-doc-2023.209.0.0.0.0svn63967-53.1.noarch.rpm"
RPM_HASH = "b0a50f675e78fe48fb84b35f14f11c6312f0a3a38590571e48525d3d47154dac8d3cdcdc7158240b306e846294b3f38aa9b3fd2ff8b07bb721455b46547022cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-precattl-doc"

RDEPENDS:${PN} += ""

inherit rpm
