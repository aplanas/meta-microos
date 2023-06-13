SUMMARY = "Documentation for texlive-lua-ul"
DESCRIPTION = "This package includes the documentation for texlive-lua-ul"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn63469"

RPM_NAME = "texlive-lua-ul-doc-2023.201.0.0.2.0svn63469-52.1.noarch.rpm"
RPM_HASH = "52ed6cb6374bccc7f21b9d89c21920e9a7c9e419bf738c91762beb3941b139b0622bc4667c8ea2bb61aef51c73bcc54b3d8aeafbcd88bcf34a9b1d71813adf8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
