SUMMARY = "Change font size in Plain TeX"
DESCRIPTION = "A series of files, each of which defines a size-change macro. \
Note that 10point.tex is by convention called by one of the \
other files, so that there's always a 'way back'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-varisize-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "316ab618f6db124c44773f2f5f0c78842171c867f1c5ae16324d55869bfb4e1c63bc400af3133d43ec1aa4647a4bef4424b9da8005c5f06dfbf08abf69affa2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-10point.tex \
tex-10pointss.tex \
tex-11point.tex \
tex-12point.tex \
tex-14point.tex \
tex-17point.tex \
tex-20point.tex \
tex-7point.tex \
tex-8point.tex \
tex-9point.tex \
texlive-varisize"

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
