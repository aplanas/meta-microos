SUMMARY = "Print numbers in a 'friendly' format"
DESCRIPTION = "Provides a command to print a number with (potentially \
different) separators every three digits in the parts either \
side of the decimal point (the point itself is also \
configurable). The macro is fully expandable and not fragile \
(unless one of the separators is). There is also a command \
\\sepnumform, that may be used when defining \\the<counter> \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn20186"

RPM_NAME = "texlive-sepnum-2023.201.2.0svn20186-53.1.noarch.rpm"
RPM_HASH = "6a03db91f58bb1a9bd63e0e5b045bbc4bbb519a05df77d2955d78c5717983fd71b908bfc8936d22fbc612d408df1d5dafe1e0932891679f968ff4c9d38ec5267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sepnum.sty \
texlive-sepnum"

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
