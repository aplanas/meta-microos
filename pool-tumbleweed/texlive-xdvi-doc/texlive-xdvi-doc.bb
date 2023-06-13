SUMMARY = "Documentation for texlive-xdvi"
DESCRIPTION = "This package includes the documentation for texlive-xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62387"

RPM_NAME = "texlive-xdvi-doc-2023.201.svn62387-52.1.noarch.rpm"
RPM_HASH = "d45a2801ec2d78e5e84054b5731385df63d053a164cc49ae7f23c8c4266c60dff9eabc97e48d31ddf6a071914d68c645543596fe6fc4874f9c7a486b90ff32c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(xdvi.1) \
texlive-xdvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
