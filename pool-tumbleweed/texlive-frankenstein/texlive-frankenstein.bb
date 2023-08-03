SUMMARY = "A collection of LaTeX packages"
DESCRIPTION = "Frankenstein is a bundle of LaTeX packages serving various \
purposes and a BibTeX bibliography style. Descriptions are \
given under the individual packages: abbrevs, achicago package, \
achicago bibstyle, attrib, blkcntrl, compsci, dialogue, lips, \
moredefs, newclude, slemph, titles."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-frankenstein-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "a80d0972245089ab51746c16448a66b20e372bceaa3f61614b5267fced6692af918671fb406e9a3ad5f07bd93ce9330e2d0d9c8833c8c7fa128ae17d776a4072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abbrevs.cfg \
tex-abbrevs.sty \
tex-achicago.sty \
tex-attrib.sty \
tex-blkcntrl.sty \
tex-compsci.cfg \
tex-compsci.sty \
tex-dialogue.sty \
tex-lips.sty \
tex-moredefs.sty \
tex-newclude.sty \
tex-slemph.cfg \
tex-slemph.sty \
tex-titles.cfg \
tex-titles.sty \
texlive-frankenstein"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
