SUMMARY = "Documentation for texlive-hep-acronym"
DESCRIPTION = "This package includes the documentation for texlive-hep-acronym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-doc-2023.209.1.1svn64890-54.2.noarch.rpm"
RPM_HASH = "080aa771f01194b98a6f7569c1a8b35eb01247975d590bf4cbdca421ab6eff6bb1cd597ec9e46abe9b67dc5bea9569c633f6f4ef7685dd249d63837fcb54082f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-acronym-doc"

RDEPENDS:${PN} += ""

inherit rpm
