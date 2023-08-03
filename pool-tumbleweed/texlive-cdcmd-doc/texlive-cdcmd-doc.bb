SUMMARY = "Documentation for texlive-cdcmd"
DESCRIPTION = "This package includes the documentation for texlive-cdcmd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn60742"

RPM_NAME = "texlive-cdcmd-doc-2023.209.1.0svn60742-53.1.noarch.rpm"
RPM_HASH = "727041092c80963153651ededf2449141cfb56b6c84afe6fe63ae296170a5219d61c6ad4b4e096d682e6f622e877617eac782365855458f03a74d4b05eddf7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cdcmd-doc-zh \
texlive-cdcmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
