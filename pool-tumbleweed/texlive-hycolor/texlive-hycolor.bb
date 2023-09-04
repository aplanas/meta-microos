SUMMARY = "Implements colour for packages hyperref and bookmark"
DESCRIPTION = "This package provides the code for the color option that is \
used by packages hyperref and bookmark. It is not intended as \
package for the user."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn53584"

RPM_NAME = "texlive-hycolor-2023.209.1.10svn53584-54.1.noarch.rpm"
RPM_HASH = "370b8470bbe1f57baf061dc7fb2a621f9245aa9cf8bad8f8edee4650c46bfd0fc0da254b4593b6a2202eadccccf9124476ecfa609dccdf0857715e2ce97ec555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hycolor.sty \
tex-xcolor-patch.sty \
texlive-hycolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hopatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
