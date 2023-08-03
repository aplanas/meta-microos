SUMMARY = "Extensions for the title page"
DESCRIPTION = "The hep-title package extends the title macros of the standard \
classes with macros for a preprint, affiliation, editors, and \
endorsers. The package is loaded with \\usepackage{hep-title}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64907"

RPM_NAME = "texlive-hep-title-2023.209.1.1svn64907-54.1.noarch.rpm"
RPM_HASH = "1b594a8da54abb65f41bc4ab7b5757d71dd5e88679cb1d306f5ee2ee90380d9bf93f28ce0e4c84ad576f334f5986dad1de84661f46660c4df60fce263ec32ddb"
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
