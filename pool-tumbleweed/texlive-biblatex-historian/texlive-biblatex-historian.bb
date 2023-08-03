SUMMARY = "A BibLaTeX style"
DESCRIPTION = "A BibLaTeX style, based on the Turabian Manual (a version of \
Chicago)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn19787"

RPM_NAME = "texlive-biblatex-historian-2023.209.0.0.4svn19787-54.1.noarch.rpm"
RPM_HASH = "053067b8015988f172eeee5773f07c20e6d91ade3e7e64ceff655fe0898257e38688a86f8eb941e52a09c68060ab07b1d380cef3be27412488b9f3cd92b9bf2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-historian.bbx \
tex-historian.cbx \
tex-historian.lbx \
texlive-biblatex-historian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
