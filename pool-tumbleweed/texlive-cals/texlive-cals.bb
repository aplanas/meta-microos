SUMMARY = "Multipage tables with wide range of features"
DESCRIPTION = "The package is a set of macros to typeset multipage tables with \
repeatable headers and footers, with cells spanned over rows \
and columns. Decorations are supported: padding, background \
color, width of separation rules. The code is compatible with \
multicol and bidi."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4.2svn43003"

RPM_NAME = "texlive-cals-2023.201.2.4.2svn43003-52.1.noarch.rpm"
RPM_HASH = "ca79ec6c91e9e441e00954e4cb73cd1b1a51ddee03eb668aee2389f192a011f7234b68aac95ca0f027920d34af5b5e2b2a8a8f767da6164be8419da80e0c8361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cals.sty) \
texlive-cals"
RDEPENDS:${PN} += "/bin/sh \
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
