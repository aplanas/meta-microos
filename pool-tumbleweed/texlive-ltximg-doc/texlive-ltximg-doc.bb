SUMMARY = "Documentation for texlive-ltximg"
DESCRIPTION = "This package includes the documentation for texlive-ltximg"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.1svn59335"

RPM_NAME = "texlive-ltximg-doc-2023.208.2.1svn59335-53.1.noarch.rpm"
RPM_HASH = "970a4c359cea4a0a7a150e44faedb47eeff652b5cd8ae64805c7b2b94c23536a9816ae95add7e8e5c261691f7ed96e99248f680871cd5775390179804c396f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ltximg.1 \
texlive-ltximg-doc"

RDEPENDS:${PN} += ""

inherit rpm
