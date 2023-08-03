SUMMARY = "Documentation for texlive-tikzscale"
DESCRIPTION = "This package includes the documentation for texlive-tikzscale"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.6svn30637"

RPM_NAME = "texlive-tikzscale-doc-2023.209.0.0.2.6svn30637-53.1.noarch.rpm"
RPM_HASH = "741c441a05f49caafa5ac55d20add4f7c146995ae1e455d46b0e254573f8fef56c8abdf899f23f2f3d92e8a8cf2e0818a5fbd0e414aac0fc59e470630e330fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzscale-doc"

RDEPENDS:${PN} += ""

inherit rpm
