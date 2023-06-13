SUMMARY = "Documentation for texlive-luatodonotes"
DESCRIPTION = "This package includes the documentation for texlive-luatodonotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn53825"

RPM_NAME = "texlive-luatodonotes-doc-2023.201.0.0.5svn53825-52.1.noarch.rpm"
RPM_HASH = "0a3ffa10c4595410ea7fcccc8bfe05bde2e86c60cb980c854b616b2430bacad592c4d0eccceb7da10ed25307b1c78fd3417b739f623496f7bed026d83246cd91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatodonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
