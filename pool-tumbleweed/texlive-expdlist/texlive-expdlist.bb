SUMMARY = "Expanded description environments"
DESCRIPTION = "The package provides additional features for the LaTeX \
description environment, including adjustable left margin. The \
package also allows the user to 'break' a list (for example, to \
interpose a comment) without affecting the structure of the \
list (this works for itemize and eumerate lists and numbered \
lists remain in sequence)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn15878"

RPM_NAME = "texlive-expdlist-2023.209.2.4svn15878-53.1.noarch.rpm"
RPM_HASH = "855ab4b87e596cfba9d6571480a5aca98f6e5f9049f61a920734f38a1a69e64b8e0aa0632ca10f87b6434b2b2494bf1ab03b3c352db7026d277dbd410efe002d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expdlist.sty \
texlive-expdlist"

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
