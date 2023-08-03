SUMMARY = "Change the Bibliography/References title"
DESCRIPTION = "Defines a single command, \\setbibref, which sets whichever of \
\\bibname and \\refname is in use. (\\bibname is used in book.cls \
and report.cls, and \\refname is used in article.cls.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17120"

RPM_NAME = "texlive-chbibref-2023.209.1.0svn17120-54.1.noarch.rpm"
RPM_HASH = "e29e8dd281b661743b41a0661fa8c56320f97b56ea516c311519da3bce3fbafed0822435c96cd03ff9ad5d2f4a440159b05b0b956032ba27f44b781ac6b06e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chbibref.sty \
texlive-chbibref"

RDEPENDS:${PN} += "/usr/bin/sh \
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
