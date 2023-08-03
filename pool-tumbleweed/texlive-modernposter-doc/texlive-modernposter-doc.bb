SUMMARY = "Documentation for texlive-modernposter"
DESCRIPTION = "This package includes the documentation for texlive-modernposter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03.1svn47269"

RPM_NAME = "texlive-modernposter-doc-2023.209.1.03.1svn47269-55.1.noarch.rpm"
RPM_HASH = "0723043ab92778f069844a0f916cdc440fdbdf73d6a88f89f8b6c3ee7adb6d89249f4206a9c27f5bf2a00d1fca6fd116dd2d521b05fa4ad07f201fed0cc3226e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modernposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
