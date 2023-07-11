SUMMARY = "Documentation for texlive-pst-uml"
DESCRIPTION = "This package includes the documentation for texlive-pst-uml"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-doc-2023.201.0.0.83svn15878-53.2.noarch.rpm"
RPM_HASH = "db1b831a1080c12db29087294fb1b82702340ce22060fd489cc125315f85113ee8d75571d340d83659b979ee947ff82fbc34aad85effbf5a20a5e68c2fc5fd87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-uml-doc-fr \
texlive-pst-uml-doc"

RDEPENDS:${PN} += ""

inherit rpm
