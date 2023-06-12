SUMMARY = "PLaTeX standard tools bundle"
DESCRIPTION = "This bundle is an extended version of the latex-tools bundle \
developed by the LaTeX team, mainly intended to support \
pLaTeX2e and upLaTeX2e. Currently patches for the latex-tools \
bundle and Martin Schroder's ms bundle are included."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66185"

RPM_NAME = "texlive-platex-tools-2023.201.svn66185-52.1.noarch.rpm"
RPM_HASH = "43dbd6f861f3815196508adca952695748761bb0d454171315250978e9e70eababa03556d23f3380dce3bf4e3095f78138f833fb71bc218018014f2317b5da8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(plarray.sty) \
tex(pldocverb.sty) \
tex(plextarray.sty) \
tex(plextcolortbl.sty) \
tex(plextdelarray.sty) \
tex(pxatbegshi.sty) \
tex(pxeverysel.sty) \
tex(pxeveryshi.sty) \
tex(pxftnright.sty) \
tex(pxmulticol.sty) \
tex(pxxspace.sty) \
texlive-platex-tools"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(atbegshi.sty) \
tex(colortbl.sty) \
tex(delarray.sty) \
tex(doc.sty) \
tex(etoolbox.sty) \
tex(everysel.sty) \
tex(everyshi.sty) \
tex(ftnright.sty) \
tex(multicol.sty) \
tex(pdftexcmds.sty) \
tex(plext.sty) \
tex(ptrace.sty) \
tex(uptrace.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
