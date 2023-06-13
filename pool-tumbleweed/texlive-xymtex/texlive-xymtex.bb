SUMMARY = "Typesetting chemical structures"
DESCRIPTION = "XyMTeX is a set of packages for drawing a wide variety of \
chemical structural formulas in a way that reflects their \
structure. The package provides three output modes: 'LaTeX', \
'PostScript' and 'PDF'. XyMTeX's commands have a systematic set \
of arguments for specifying substituents and their positions, \
endocyclic double bonds, and bond patterns. In some cases there \
are additional arguments for specifying hetero-atoms on the \
vertices of heterocycles. It is believed that this systematic \
design allows XyMTeX to operate as a practical \
(device-independent) tool for use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.06svn32182"

RPM_NAME = "texlive-xymtex-2023.201.5.06svn32182-52.1.noarch.rpm"
RPM_HASH = "41a49d352bd43a3d7384a0a76aab089a97f342e4bdad7e2b429f26a594d655b3cae2ab60be7ebb69e1effcef022cd22d10a8e51ca72f2ffbe21644daed9a014d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aliphat.sty) \
tex(assurechemist.sty) \
tex(assurelatexmode.sty) \
tex(bondcolor.sty) \
tex(carom.sty) \
tex(ccycle.sty) \
tex(chemist.sty) \
tex(chemstr.sty) \
tex(chemtimes.sty) \
tex(chmst-pdf.sty) \
tex(chmst-ps.sty) \
tex(fusering.sty) \
tex(hcycle.sty) \
tex(hetarom.sty) \
tex(hetaromh.sty) \
tex(lewisstruc.sty) \
tex(locant.sty) \
tex(lowcycle.sty) \
tex(methylen.sty) \
tex(polymers.sty) \
tex(sizeredc.sty) \
tex(steroid.sty) \
tex(xymtex.sty) \
tex(xymtexpdf.sty) \
tex(xymtexps.sty) \
tex(xymtx-pdf.sty) \
tex(xymtx-ps.sty) \
texlive-xymtex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(epic.sty) \
tex(pgfcore.sty) \
tex(pst-coil.sty) \
tex(pstricks.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
