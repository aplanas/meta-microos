SUMMARY = "Multipage tables with wide range of features"
DESCRIPTION = "The package is a set of macros to typeset multipage tables with \
repeatable headers and footers, with cells spanned over rows \
and columns. Decorations are supported: padding, background \
color, width of separation rules. The code is compatible with \
multicol and bidi."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4.2svn43003"

RPM_NAME = "texlive-cals-2023.209.2.4.2svn43003-53.1.noarch.rpm"
RPM_HASH = "87349b7d208536d1262175c1298f453c49d31c7074aa07201c0ad2179351f81ab461b0625e3c3f5b5803aac5b596f684e8bc649a475baad76427f20825080e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cals.sty \
texlive-cals"

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
