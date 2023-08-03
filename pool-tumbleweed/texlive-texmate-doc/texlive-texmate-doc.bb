SUMMARY = "Documentation for texlive-texmate"
DESCRIPTION = "This package includes the documentation for texlive-texmate"
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn15878"

RPM_NAME = "texlive-texmate-doc-2023.209.2svn15878-55.1.noarch.rpm"
RPM_HASH = "e3a3b4638aba2e0d61b596a5ab20758327f16899302f58915606b2b2df9f61b06b26fda4ee0a3b3f838ac2417ad1594d150e110c4c235b3f51ae7aad157efd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texmate-doc"

RDEPENDS:${PN} += ""

inherit rpm
