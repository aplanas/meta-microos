SUMMARY = "Documentation for texlive-tabstackengine"
DESCRIPTION = "This package includes the documentation for texlive-tabstackengine"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.10svn46848"

RPM_NAME = "texlive-tabstackengine-doc-2023.201.2.10svn46848-54.1.noarch.rpm"
RPM_HASH = "6d026d4d898bcc29ca14da4add81db259fc4816cb8d6d0c1d9c7c17d81e973c85cbace436842ce6f107186f471085726d414d24d0a07b299ee678569687551eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabstackengine-doc"
RDEPENDS:${PN} += ""

inherit rpm
