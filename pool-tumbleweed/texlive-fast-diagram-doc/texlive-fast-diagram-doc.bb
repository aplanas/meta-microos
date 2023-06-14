SUMMARY = "Documentation for texlive-fast-diagram"
DESCRIPTION = "This package includes the documentation for texlive-fast-diagram"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn29264"

RPM_NAME = "texlive-fast-diagram-doc-2023.201.1.1svn29264-52.1.noarch.rpm"
RPM_HASH = "9000899388658069e1cae09e1dd862c806a5fe6715977af14963d5470bade3e417dc1d586a17236c0df6d78a8c8a3ea70f4a697fde10438824f0da915ab8b0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fast-diagram-doc-fr \
texlive-fast-diagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
