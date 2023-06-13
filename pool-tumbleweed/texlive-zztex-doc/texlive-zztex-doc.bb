SUMMARY = "Documentation for texlive-zztex"
DESCRIPTION = "This package includes the documentation for texlive-zztex"
LICENSE = "LPPL-1.0"

PV = "2023.201.17.7svn55862"

RPM_NAME = "texlive-zztex-doc-2023.201.17.7svn55862-52.1.noarch.rpm"
RPM_HASH = "0a5ac39bcdc4c76ad1968af8f1691311ac86c0e334b5a012dfc4c19199d98400efdaad42e2a953fcebebb244f74b2d645ced5ea4ceee8c34f16e7bf9b7702339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zztex-doc"

RDEPENDS:${PN} += ""

inherit rpm
