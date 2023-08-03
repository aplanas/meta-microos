SUMMARY = "Documentation for texlive-present"
DESCRIPTION = "This package includes the documentation for texlive-present"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn50048"

RPM_NAME = "texlive-present-doc-2023.209.2.2.1svn50048-53.1.noarch.rpm"
RPM_HASH = "483fa3717780ac08f52920f0f400b7f0d930a0c21aee0850938287cda7cf062ada44053e1d49e40089f318065892dff2169f449f2d5b805ef00c4da687423049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-present-doc"

RDEPENDS:${PN} += ""

inherit rpm
