SUMMARY = "Documentation for texlive-biblatex-spbasic"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-spbasic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn61439"

RPM_NAME = "texlive-biblatex-spbasic-doc-2023.209.0.0.04svn61439-54.1.noarch.rpm"
RPM_HASH = "1992407f1a5b0c9db7467bc194192da4179c21ace5f984f4477b69baf16113e08f29c2acba81580382c2a5920cfff6059e214c6fbd526de1af86e3dfe06fa7c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-spbasic-doc"

RDEPENDS:${PN} += ""

inherit rpm
