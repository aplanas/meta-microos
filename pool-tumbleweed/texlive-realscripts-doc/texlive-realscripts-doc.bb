SUMMARY = "Documentation for texlive-realscripts"
DESCRIPTION = "This package includes the documentation for texlive-realscripts"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3dsvn56594"

RPM_NAME = "texlive-realscripts-doc-2023.209.0.0.3dsvn56594-54.2.noarch.rpm"
RPM_HASH = "fde0c23952d240337bbfc593219d4486eb3f230d67f573e54e8472fc2914c93fd06e045baee6dc8057c119269f4e66c65130b44e7a42c5526a9e6bb074c4dc70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
