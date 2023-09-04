SUMMARY = "Produce output similar to that of APJ"
DESCRIPTION = "A LaTeX class (based on current RevTeX) to produce preprints \
with the page layout similar to that of the Astrophysical \
Journal."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28469"

RPM_NAME = "texlive-emulateapj-2023.209.svn28469-54.2.noarch.rpm"
RPM_HASH = "dd48e40abc0a7e860aec7fb8cbecdd2eed9856715446c737aa133bb02ad188af3940ee9b5322e8dd1c45e92e3c2e4ab7efa601896bd2c01df169bbded33a3198"
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
