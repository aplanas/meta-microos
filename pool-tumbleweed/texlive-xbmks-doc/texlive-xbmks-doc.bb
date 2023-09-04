SUMMARY = "Documentation for texlive-xbmks"
DESCRIPTION = "This package includes the documentation for texlive-xbmks"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53448"

RPM_NAME = "texlive-xbmks-doc-2023.209.svn53448-53.2.noarch.rpm"
RPM_HASH = "48752629e51f1b45ea0e31ae9df1253d4d26693b956cc329f038a2121612756623005f12490912d3d2cd95df63148029efaad07f9e01d4a43c5915d1492954b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xbmks-doc"

RDEPENDS:${PN} += ""

inherit rpm
