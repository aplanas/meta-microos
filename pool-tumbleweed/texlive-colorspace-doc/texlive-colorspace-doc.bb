SUMMARY = "Documentation for texlive-colorspace"
DESCRIPTION = "This package includes the documentation for texlive-colorspace"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn50585"

RPM_NAME = "texlive-colorspace-doc-2023.209.1.3svn50585-54.1.noarch.rpm"
RPM_HASH = "bee8fbbfce002e16d6022c7319c234fc33b150a1674235990e75d6273f6af4862472702917f5f97aaab836f477a7eebb311dc0a350c50d3aab316ee274aa4721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
