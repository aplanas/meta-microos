SUMMARY = "A tool to manage anonymous work with BibLaTeX"
DESCRIPTION = "The package provides tools to help manage anonymous work with \
BibLaTeX. It will be useful, for example, in history or \
classical philology."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6.2svn48548"

RPM_NAME = "texlive-biblatex-anonymous-2023.201.2.6.2svn48548-53.1.noarch.rpm"
RPM_HASH = "58f32d7b6420df9bdff8fd289512a33d1171ec824f49f151fcf9833abb4f25346f6827c25e3cd1372ef7a9781a741490065f86c10f1079d096ba89d79342f04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-anonymous.sty) \
texlive-biblatex-anonymous"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
