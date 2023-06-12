SUMMARY = "Documentation for texlive-simpleicons"
DESCRIPTION = "This package includes the documentation for texlive-simpleicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.8.6.0svn66328"

RPM_NAME = "texlive-simpleicons-doc-2023.201.8.6.0svn66328-53.1.noarch.rpm"
RPM_HASH = "d7497c12e3f95883c03e75e3fe8a21d8d3ca1dd92da5a29dfcb83abd5f0951bae8f9498182f5ecc0234189810cf5d268c6afb17e6b42dd2c3bdc808cf11c26e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleicons-doc"
RDEPENDS:${PN} += ""

inherit rpm
