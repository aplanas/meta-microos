SUMMARY = "Documentation for texlive-termes-otf"
DESCRIPTION = "This package includes the documentation for texlive-termes-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn64733"

RPM_NAME = "texlive-termes-otf-doc-2023.209.0.0.02svn64733-55.1.noarch.rpm"
RPM_HASH = "64d886437144a008336bbbc17a78151a33ade7b6133aa128bc5b0e403983f34f4d2fe9a2e7c281bf6acaf61dcdebb7c4060f703aaf5ca07491316a8504f7db94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termes-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
