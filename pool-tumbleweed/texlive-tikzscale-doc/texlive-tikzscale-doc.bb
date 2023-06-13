SUMMARY = "Documentation for texlive-tikzscale"
DESCRIPTION = "This package includes the documentation for texlive-tikzscale"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.6svn30637"

RPM_NAME = "texlive-tikzscale-doc-2023.201.0.0.2.6svn30637-52.1.noarch.rpm"
RPM_HASH = "147c7f26444f6164ec7a3657160c855fcd659a56cc188c1028a0272baba845a48115cfadf5b69e9be4ca4bbe903e19c5fa526e71d7e7147b658a7e30e2e7d6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzscale-doc"

RDEPENDS:${PN} += ""

inherit rpm
