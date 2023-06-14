SUMMARY = "A collection of LaTeX packages"
DESCRIPTION = "Frankenstein is a bundle of LaTeX packages serving various \
purposes and a BibTeX bibliography style. Descriptions are \
given under the individual packages: abbrevs, achicago package, \
achicago bibstyle, attrib, blkcntrl, compsci, dialogue, lips, \
moredefs, newclude, slemph, titles."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-frankenstein-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "181d1caf9476033fac6ec6367f86b4ff2adb65ef6a3285c8a1e98f837d78fe4ad1228a977f2034651b318f5d049b2735cd36d2d6ebe44393104c02f04b7b3163"
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

RDEPENDS:${PN} += "/bin/sh \
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
