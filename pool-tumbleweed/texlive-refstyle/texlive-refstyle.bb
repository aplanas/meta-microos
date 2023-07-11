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

PV = "2023.201.0.0.5svn20318"

RPM_NAME = "texlive-refstyle-2023.201.0.0.5svn20318-53.2.noarch.rpm"
RPM_HASH = "ef3b9b404ea4955aa6a51ac26104896b9a697f6ae0a07d6fe54d3f63d4c0757a30b33cf0ac58b06cd865d72f94985713281293726f04cd2e5a998531f72e1156"
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
