SUMMARY = "Documentation for texlive-biblatex-iso690"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-iso690"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn62866"

RPM_NAME = "texlive-biblatex-iso690-doc-2023.209.0.0.4.1svn62866-54.1.noarch.rpm"
RPM_HASH = "d039af88ca9b914f4acee2ef175c3aa722b7063f8a80e28e8717167f48d0e0236a914a0a614aeb1d0d52b14e8b3b4caff90f812fab1b637b3f2d8af01eae1e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-iso690-doc"

RDEPENDS:${PN} += ""

inherit rpm
