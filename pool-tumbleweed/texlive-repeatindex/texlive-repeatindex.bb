SUMMARY = "Repeat items in an index after a page or column break"
DESCRIPTION = "This Package repeats item of an index if a page or column break \
occurs within a list of subitems. This helps to find out to \
which main item a subitem belongs."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-2023.201.0.0.01svn24305-53.2.noarch.rpm"
RPM_HASH = "fd53288b42bf46b351c0de1b77e254194037cae88e32d91a4dcd57f7120f8187efea9a6f4807cf69cb205bced4f6e6dfd7232cfdc9651743b0cca8ce8623b0a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-repeatindex.sty \
texlive-repeatindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
