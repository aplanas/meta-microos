SUMMARY = "Corporate Design for Bern University of Applied Sciences"
DESCRIPTION = "This bundle provides possibilities to use the Corporate Design \
of Bern University of Applied Sciences (BFH) with LaTeX. To \
this end it contains classes as well as some helper packages \
and config files together with some demo files."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn66461"

RPM_NAME = "texlive-bfh-ci-2023.209.2.1.5svn66461-54.1.noarch.rpm"
RPM_HASH = "2132ba638b0b2415349954c738374667b3edabb26ab35ea1b6baab07af39abb96c910e189ae98e2175fb41cc8df8c2401ec68237d4a18413fb77f5cde9ce11f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeBFH.sty \
tex-beamerfontthemeBFH.sty \
tex-beamerinnerthemeBFH.sty \
tex-beamerouterthemeBFH-sidebar.sty \
tex-beamerouterthemeBFH.sty \
tex-beamerthemeBFH.sty \
tex-bfh-a0paper.clo \
tex-bfh-a1paper.clo \
tex-bfh-a2paper.clo \
tex-bfh-a3paper.clo \
tex-bfh-a4paper.clo \
tex-bfh-a5paper.clo \
tex-bfh-a6paper.clo \
tex-bfh-beamerarticle.cfg \
tex-bfh-factsheet.cfg \
tex-bfh-layout-boxes.cfg \
tex-bfh-layout-listings.cfg \
tex-bfh-layout-rules.cfg \
tex-bfh-layout-tabular.cfg \
tex-bfh-layout-terminal.cfg \
tex-bfh-projectproposal.cfg \
tex-bfhbeamer.cls \
tex-bfhcolors.sty \
tex-bfhfonts.sty \
tex-bfhlayout.sty \
tex-bfhletter.sty \
tex-bfhlettersize9.5pt.clo \
tex-bfhmodule.sty \
tex-bfhpub.cls \
tex-bfhsciposter.cls \
tex-bfhthesis.cls \
texlive-bfh-ci"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-anyfontsize.sty \
tex-beamer.cls \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-handoutWithNotes.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
tex-nunito.sty \
tex-qrcode.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-scrletter.sty \
tex-sourceserifpro.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-translations.sty \
tex-trimclip.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
