SUMMARY = "Documentation for texlive-longdivision"
DESCRIPTION = "This package includes the documentation for texlive-longdivision"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn59979"

RPM_NAME = "texlive-longdivision-doc-2023.209.1.2.1svn59979-55.1.noarch.rpm"
RPM_HASH = "eb45cc07b35fe1c7cde8ffdebb25f672f3a4e634f1cc3f8b62e5880aced7db8437953ecf8209e7e65970f3ab0996ed198bf2b3593e21e94d882a1c41658bcd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longdivision-doc"

RDEPENDS:${PN} += ""

inherit rpm
