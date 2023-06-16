SUMMARY = "Writing a TeX length with a space between number and unit"
DESCRIPTION = "Writing a TeX length with \\the writes the value and the unit \
without a space. Package isopt provides a macro \\ISO which \
inserts a user defined space between number and unit."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn45509"

RPM_NAME = "texlive-isopt-2023.201.0.0.01svn45509-55.1.noarch.rpm"
RPM_HASH = "0fce296df70124897487d9545b1195d496a6b32f3de41de414a7e88d815674c2ea636da200a75fa00b52fa51c1eb7cdd3d7386ebb6058cb3528122f6aaa5e365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isopt.sty \
texlive-isopt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
