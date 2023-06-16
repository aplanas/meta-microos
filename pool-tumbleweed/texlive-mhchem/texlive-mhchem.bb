SUMMARY = "Typeset chemical formulae/equations and H and P statements"
DESCRIPTION = "The bundle provides three packages: The mhchem package provides \
commands for typesetting chemical molecular formulae and \
equations. The hpstatement package provides commands for the \
official hazard statements and precautionary statements (H and \
P statements) that are used to label chemicals. The rsphrase \
package provides commands for the official Risk and Safety (R \
and S) Phrases that are used to label chemicals. The package \
requires the expl3 bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61456"

RPM_NAME = "texlive-mhchem-2023.201.svn61456-54.1.noarch.rpm"
RPM_HASH = "aba83aea8899a2470c3047a128be81c0a66f3be68a0cd5ea55d7e3e7377d2eed5a0a0f60b99310164dd7b0fd3ce7bcb65a1760db5867e34da0b39dffa9a53fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hpstatement-bg.inc.sty \
tex-hpstatement-cs.inc.sty \
tex-hpstatement-da.inc.sty \
tex-hpstatement-de.inc.sty \
tex-hpstatement-el.inc.sty \
tex-hpstatement-en.inc.sty \
tex-hpstatement-es.inc.sty \
tex-hpstatement-et.inc.sty \
tex-hpstatement-fi.inc.sty \
tex-hpstatement-fr.inc.sty \
tex-hpstatement-ga.inc.sty \
tex-hpstatement-hr.inc.sty \
tex-hpstatement-hu.inc.sty \
tex-hpstatement-it.inc.sty \
tex-hpstatement-lt.inc.sty \
tex-hpstatement-lv.inc.sty \
tex-hpstatement-mt.inc.sty \
tex-hpstatement-nl.inc.sty \
tex-hpstatement-pl.inc.sty \
tex-hpstatement-pt.inc.sty \
tex-hpstatement-ro.inc.sty \
tex-hpstatement-sk.inc.sty \
tex-hpstatement-sl.inc.sty \
tex-hpstatement-sv.inc.sty \
tex-hpstatement.sty \
tex-mhchem.sty \
tex-rsphrase.sty \
texlive-mhchem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-chemgreek.sty \
tex-expl3.sty \
tex-graphics.sty \
tex-iflang.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-pgf.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-amsmath \
texlive-chemgreek \
texlive-filesystem \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm
