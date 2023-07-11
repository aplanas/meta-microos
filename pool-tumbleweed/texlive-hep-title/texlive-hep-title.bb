SUMMARY = "Extensions for the title page"
DESCRIPTION = "The hep-title package extends the title macros of the standard \
classes with macros for a preprint, affiliation, editors, and \
endorsers. The package is loaded with \\usepackage{hep-title}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64907"

RPM_NAME = "texlive-hep-title-2023.201.1.1svn64907-53.2.noarch.rpm"
RPM_HASH = "9215bb0e09319f1a527201b15d43937ff8eec56cb5f1e2f09abaa47175829f7c213142b43ec6d9fe521d707c0d8e2b75fce65770c97dd2a389ee0edf9e53d196"
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
