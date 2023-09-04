SUMMARY = "Control layout of itemize, enumerate, description"
DESCRIPTION = "This package provides user control over the layout of the three \
basic list environments: enumerate, itemize and description. It \
supersedes both enumerate and mdwlist (providing \
well-structured replacements for all their funtionality), and \
in addition provides functions to compute the layout of labels, \
and to 'clone' the standard environments, to create new \
environments with counters of their own."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.9svn51423"

RPM_NAME = "texlive-enumitem-2023.209.3.9svn51423-54.2.noarch.rpm"
RPM_HASH = "66711970ee57533c978211fec8c4835523785acbc195ce6a0608902fcc501ae6e69bc33adc659d87da5a574672db884462526b971fc80a75c59115c40a5fa0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enumitem.sty \
texlive-enumitem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
