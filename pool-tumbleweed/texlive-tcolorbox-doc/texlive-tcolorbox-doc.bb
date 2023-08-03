SUMMARY = "Documentation for texlive-tcolorbox"
DESCRIPTION = "This package includes the documentation for texlive-tcolorbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0.1svn65800"

RPM_NAME = "texlive-tcolorbox-doc-2023.209.6.0.1svn65800-55.1.noarch.rpm"
RPM_HASH = "8b9179efd982837556214c9f6567efc0b75aedd46f43091b620eff6cc477945b64405ad84f8ecda3e6960ed679e7b7329ca090031340e24b2578086abce718e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tcolorbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
