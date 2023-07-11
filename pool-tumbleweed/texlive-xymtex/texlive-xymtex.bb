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

RPM_NAME = "texlive-xymtex-2023.201.5.06svn32182-52.2.noarch.rpm"
RPM_HASH = "e55b7f4459609dd513dfffe442e6636270b60a9a71232ebac64c079ddf995ac5d1f4a2ea74eb30c86e035c5137a7f4103697cf1bf652dd69108f2e69b69d5d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aliphat.sty \
tex-assurechemist.sty \
tex-assurelatexmode.sty \
tex-bondcolor.sty \
tex-carom.sty \
tex-ccycle.sty \
tex-chemist.sty \
tex-chemstr.sty \
tex-chemtimes.sty \
tex-chmst-pdf.sty \
tex-chmst-ps.sty \
tex-fusering.sty \
tex-hcycle.sty \
tex-hetarom.sty \
tex-hetaromh.sty \
tex-lewisstruc.sty \
tex-locant.sty \
tex-lowcycle.sty \
tex-methylen.sty \
tex-polymers.sty \
tex-sizeredc.sty \
tex-steroid.sty \
tex-xymtex.sty \
tex-xymtexpdf.sty \
tex-xymtexps.sty \
tex-xymtx-pdf.sty \
tex-xymtx-ps.sty \
texlive-xymtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epic.sty \
tex-pgfcore.sty \
tex-pst-coil.sty \
tex-pstricks.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
