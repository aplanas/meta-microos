SUMMARY = "A set of LaTeX classes for preparing proposals for collaborative projects"
DESCRIPTION = "The process of preparing a collaborative proposal, to a major \
funding body, involves integration of contributions of a many \
people at many sites. It is therefore an ideal application for \
a text-based document preparation system such as LaTeX, in \
concert with a distributed version control system such as SVN. \
The proposal class itself provides a basis for such an \
enterprise. The dfgproposal and dfgproposal classes provide two \
specialisations of the base class for (respectively) German and \
European research proposals. The packages depend on the \
author's stex bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn40538"

RPM_NAME = "texlive-proposal-2023.201.svn40538-52.1.noarch.rpm"
RPM_HASH = "62482546658d4a4da8a22f91dcdb7771eb769701053c5afee35ae710b70f899a330e46bf35b757c70f4d016b316d373d3079de507fcd9cb3ad4cc4f85a9d62e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dfgpdata.sty \
tex-dfgproposal.cls \
tex-dfgreporting.cls \
tex-eupdata.sty \
tex-euproposal.cls \
tex-eureporting.cls \
tex-pdata.sty \
tex-proposal.cls \
tex-reporting.cls \
texlive-proposal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-boxedminipage.sty \
tex-chngcntr.sty \
tex-colortbl.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-ed.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-gitinfo2.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-longtable.sty \
tex-mdframed.sty \
tex-paralist.sty \
tex-rotating.sty \
tex-svninfo.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-url.sty \
tex-wasysym.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
