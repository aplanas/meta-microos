SUMMARY = "Documentation for texlive-na-box"
DESCRIPTION = "This package includes the documentation for texlive-na-box"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45130"

RPM_NAME = "texlive-na-box-doc-2023.209.1.0svn45130-55.1.noarch.rpm"
RPM_HASH = "957ea4026013eea52540433380621776d54a788f6eaeabe55dd0b2f4459030015f0ccc940c15fca134f15ba4d2ae2a9fef40105450a7756e7950ef9031a8d3f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-na-box-doc-ar \
texlive-na-box-doc"

RDEPENDS:${PN} += ""

inherit rpm
