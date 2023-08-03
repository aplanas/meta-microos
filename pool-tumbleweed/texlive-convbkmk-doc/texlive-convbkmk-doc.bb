SUMMARY = "Documentation for texlive-convbkmk"
DESCRIPTION = "This package includes the documentation for texlive-convbkmk"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.30svn49252"

RPM_NAME = "texlive-convbkmk-doc-2023.209.0.0.30svn49252-55.1.noarch.rpm"
RPM_HASH = "571e35d21b1807f709d8128b3151448794852cfd98e7ce9de871886a3fc5881c739a740d73f79d28c090583862a63f9c94cf2195c34ba88ec28214f926026454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-convbkmk-doc"

RDEPENDS:${PN} += ""

inherit rpm
