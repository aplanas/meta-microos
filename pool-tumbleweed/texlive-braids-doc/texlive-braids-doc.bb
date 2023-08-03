SUMMARY = "Documentation for texlive-braids"
DESCRIPTION = "This package includes the documentation for texlive-braids"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn64817"

RPM_NAME = "texlive-braids-doc-2023.209.2.2svn64817-53.1.noarch.rpm"
RPM_HASH = "e56c98d8a00440d7d9641283e3eaf6e11d02794925456540dc6da4f499609253274b958744499da49d0c0111f54b988413adb238700570d2d4f416b453fd7ad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braids-doc"

RDEPENDS:${PN} += ""

inherit rpm
