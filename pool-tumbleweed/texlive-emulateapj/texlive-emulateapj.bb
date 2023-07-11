SUMMARY = "Produce output similar to that of APJ"
DESCRIPTION = "A LaTeX class (based on current RevTeX) to produce preprints \
with the page layout similar to that of the Astrophysical \
Journal."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28469"

RPM_NAME = "texlive-emulateapj-2023.201.svn28469-53.2.noarch.rpm"
RPM_HASH = "cf75d4dd688bb4d208f6d5cd1c7020d8554df0662241173cd8632acd11e369199a70732a17de99cfb1864c5c74ae937596a8b9c3cf33be7d8491eab4d9171d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emulateapj.cls \
texlive-emulateapj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-epsf.sty \
tex-graphicx.sty \
tex-latexsym.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
