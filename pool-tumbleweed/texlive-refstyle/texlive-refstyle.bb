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

RPM_NAME = "texlive-refstyle-2023.209.0.0.5svn20318-54.2.noarch.rpm"
RPM_HASH = "5aec0cce4b197a7bc82bb0963bdb7f67f24173a750a26bd4c41f2749fbda4ab4ceaf162035d529329a970f479d7d64a93d876d521b6ff96791fd4b375936c9ca"
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
