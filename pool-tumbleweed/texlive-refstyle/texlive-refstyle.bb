SUMMARY = "Advanced formatting of cross references"
DESCRIPTION = "The package provides a consistent way of producing references \
throughout a project. Enough flexibility is provided to make \
local changes to a single reference. The user can configure \
their own setup. The package offers a direct interface to \
varioref (for use, for example, in large projects such as a \
series of books, or a multivolume thesis written as a series of \
documents), and name references from the nameref package may be \
incorporated with ease. For large projects such as a series of \
books or a multi volume thesis, written as freestanding \
documents, a facility is provided to interface to the xr \
package for external document references."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn20318"

RPM_NAME = "texlive-refstyle-2023.209.0.0.5svn20318-54.1.noarch.rpm"
RPM_HASH = "59463c1b76cbe7d45d6b5b44ea9ab97ae1a1be1d2e2ee0f414aa0284f30eef77edbdb5fac4b3ebf9f392ceafb07c1b7bc1ab625f1e820bf00ebae4a028c7264d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refstyle.cfg \
tex-refstyle.sty \
texlive-refstyle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
