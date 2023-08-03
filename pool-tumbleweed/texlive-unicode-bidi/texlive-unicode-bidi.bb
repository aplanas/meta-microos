SUMMARY = "Experimental unicode bidi package for XeTeX"
DESCRIPTION = "The experimental unicode-bidi package allows to mix non-RTL \
script with RTL script without any markup."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn42482"

RPM_NAME = "texlive-unicode-bidi-2023.209.0.0.01svn42482-54.1.noarch.rpm"
RPM_HASH = "5c3aaf1e3badc5470bb215d162ef154aa695c28af4c34a444d348b221ee7375aab74e399de3e32a0ca0d050e4977a70cbf496a9480b77ff72a216d284c72c721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-bidi.sty \
texlive-unicode-bidi"

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
