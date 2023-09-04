SUMMARY = "Extensions for the title page"
DESCRIPTION = "The hep-title package extends the title macros of the standard \
classes with macros for a preprint, affiliation, editors, and \
endorsers. The package is loaded with \\usepackage{hep-title}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64907"

RPM_NAME = "texlive-hep-title-2023.209.1.1svn64907-54.2.noarch.rpm"
RPM_HASH = "d36a3c3f2f5f67a125eaf263c226d6365c257c2fa88114bd27886a04a04cc45a88ebae2f070f2463a618ac5a1276b7d7fac3130cc3f76e8752421a7fa4c0d0a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-title.sty \
texlive-hep-title"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abstract.sty \
tex-atbegshi.sty \
tex-authblk.sty \
tex-calc.sty \
tex-environ.sty \
tex-picture.sty \
tex-titling.sty \
tex-varwidth.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
