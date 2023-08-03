SUMMARY = "Documentation for texlive-overarrows"
DESCRIPTION = "This package includes the documentation for texlive-overarrows"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65853"

RPM_NAME = "texlive-overarrows-doc-2023.209.1.1svn65853-55.1.noarch.rpm"
RPM_HASH = "bade666301b0c09f17e4030e4aa7d260c5f1cce27fc92431a275c268623a6b7d6dc6312b07f1d7491a4a00efa4061c5aae946ad29b76aee4f816ef751428821d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
