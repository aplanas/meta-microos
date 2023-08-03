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

RPM_NAME = "texlive-enumitem-2023.209.3.9svn51423-54.1.noarch.rpm"
RPM_HASH = "b613434930daea9224b8df4184cdaa6685e9d472db14319f2fe4e49f4899dbb66fbc6c38fc54c9dc0fdf2834c39b46920c0ee10660172c5ffc576b7aaffbf28b"
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
