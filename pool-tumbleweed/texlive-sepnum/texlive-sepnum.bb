SUMMARY = "Print numbers in a 'friendly' format"
DESCRIPTION = "Provides a command to print a number with (potentially \
different) separators every three digits in the parts either \
side of the decimal point (the point itself is also \
configurable). The macro is fully expandable and not fragile \
(unless one of the separators is). There is also a command \
\\sepnumform, that may be used when defining \\the<counter> \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn20186"

RPM_NAME = "texlive-sepnum-2023.209.2.0svn20186-54.1.noarch.rpm"
RPM_HASH = "0a7988c55475544e632e3dc08d2ae4bb66b0b39b51220096ca122e8df0c127d2b89a638f63ff9dd2b607932f0722cf4a58f701307ee76480102866177e1c0c86"
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
