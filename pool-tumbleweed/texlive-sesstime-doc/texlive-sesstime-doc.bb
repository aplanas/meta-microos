SUMMARY = "Documentation for texlive-sesstime"
DESCRIPTION = "This package includes the documentation for texlive-sesstime"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn49750"

RPM_NAME = "texlive-sesstime-doc-2023.209.1.12svn49750-54.1.noarch.rpm"
RPM_HASH = "ef10d894e7ae6d3ab92f0ff2f45c7da67bd1158eb60eaad1d2b15dc1a63e6e7a80d55cc77967b95c8f0c61a2af01dcfd8a147c0a93ab378e241a7bc54cf06f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sesstime-doc"

RDEPENDS:${PN} += ""

inherit rpm
