SUMMARY = "Documentation for texlive-elmath"
DESCRIPTION = "This package includes the documentation for texlive-elmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-elmath-doc-2023.209.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "d0ab1fb1aac53c6eb747ae6f4f7fcb3de93a6351a4aaa34986e41ca59771969ffd1c4666378e5aaa8886fd0fd67e35fe4d201567a5c64bbc1e94046b5771072d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
