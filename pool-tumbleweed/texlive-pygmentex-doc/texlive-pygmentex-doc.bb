SUMMARY = "Documentation for texlive-pygmentex"
DESCRIPTION = "This package includes the documentation for texlive-pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-doc-2023.209.0.0.11svn64131-54.1.noarch.rpm"
RPM_HASH = "2313fe00f2a98599a918c6b22b8b4b75bb55873b05d78f4c785c975c1fa22247651bfe12713c70c256a139996aabfa4d9f25dd39d6ec16310cd5d1f938b2649f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
