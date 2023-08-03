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

PV = "2023.209.svn40538"

RPM_NAME = "texlive-proposal-2023.209.svn40538-53.1.noarch.rpm"
RPM_HASH = "af5f9804700dea8b3c86798857d08437b599c16e990ca2e9fae97867ed5784140e2b56c336194a708c7d3ce3b945ecf322d6e633e66524f557e171dafee0eef2"
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
