SUMMARY = "Documentation for texlive-arcs"
DESCRIPTION = "This package includes the documentation for texlive-arcs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn15878"

RPM_NAME = "texlive-arcs-doc-2023.209.1svn15878-55.1.noarch.rpm"
RPM_HASH = "7a8b65944e556ee28c1c9c0caff5eca9c60906016f5337b8c88cd1d49601c6e977195b6f5928f2b3cd462f7a121b4701a96db54e53b978a351a1b64e952ca79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arcs-doc"

RDEPENDS:${PN} += ""

inherit rpm
