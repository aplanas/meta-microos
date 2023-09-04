SUMMARY = "Documentation for texlive-zref-clever"
DESCRIPTION = "This package includes the documentation for texlive-zref-clever"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.6svn66021"

RPM_NAME = "texlive-zref-clever-doc-2023.209.0.0.3.6svn66021-53.2.noarch.rpm"
RPM_HASH = "f09605bad6b4e1b7ad92bb8ca6991bb8fe7f1a9816d5e5ef187539dc4b631b105462ab099b3daea69309ed1dd12fe699727954722b39b8b81328c55b67a2b618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-clever-doc"

RDEPENDS:${PN} += ""

inherit rpm
