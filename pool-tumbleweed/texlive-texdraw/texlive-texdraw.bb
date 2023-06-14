SUMMARY = "Graphical macros, using embedded PostScript"
DESCRIPTION = "TeXdraw is a set of macro definitions for TeX, which allow the \
user to produce PostScript drawings from within TeX and LaTeX. \
TeXdraw has been designed to be extensible. Drawing 'segments' \
are relocatable, self-contained units. Using a combination of \
TeX's grouping mechanism and the gsave/grestore mechanism in \
PostScript, drawing segments allow for local changes to the \
scaling and line parameters. Using TeX's macro definition \
capability, new drawing commands can be constructed from \
drawing segments."
LICENSE = "LPPL-1.0"

PV = "2023.201.v2r3svn64477"

RPM_NAME = "texlive-texdraw-2023.201.v2r3svn64477-54.1.noarch.rpm"
RPM_HASH = "f693df91eb2e7851a35f12ad1fe95201394f720e2074184167044c4d3b2c7eaff6283cb99db480c3d1341a1160ea528daa2efd6927f1f357e5106dfc3c696aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blockdiagram.tex \
tex-texdraw.sty \
tex-texdraw.tex \
tex-txdps.tex \
tex-txdtools.tex \
texlive-texdraw"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
