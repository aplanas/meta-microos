SUMMARY = "Documentation for texlive-zztex"
DESCRIPTION = "This package includes the documentation for texlive-zztex"
LICENSE = "LPPL-1.0"

PV = "2023.209.17.7svn55862"

RPM_NAME = "texlive-zztex-doc-2023.209.17.7svn55862-53.2.noarch.rpm"
RPM_HASH = "3995439425cbf4616a025d1a4e6fd7d558f2d8d7ae29092ca5691eb1a3c7aa8b7bb45ee7fbe1cd7c9a4886b3fde994a7ac3c9380402a75c6ed985778530b89b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zztex-doc"

RDEPENDS:${PN} += ""

inherit rpm
