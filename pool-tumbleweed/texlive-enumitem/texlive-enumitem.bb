SUMMARY = "Control layout of itemize, enumerate, description"
DESCRIPTION = "This package provides user control over the layout of the three \
basic list environments: enumerate, itemize and description. It \
supersedes both enumerate and mdwlist (providing \
well-structured replacements for all their funtionality), and \
in addition provides functions to compute the layout of labels, \
and to 'clone' the standard environments, to create new \
environments with counters of their own."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9svn51423"

RPM_NAME = "texlive-enumitem-2023.201.3.9svn51423-53.2.noarch.rpm"
RPM_HASH = "c6317fbf9c22b583213f3721641f3dc4a79c35f2727ba0a55d0a92b8ffb343103d606c84538f80667286710e9b25bc4bee422a81dfeca0c09abbabe1df6a4736"
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
