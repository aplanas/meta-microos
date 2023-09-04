SUMMARY = "Simplify usage of \\hypertarget and \\hyperlink"
DESCRIPTION = "Three hyperref-based macros that simplify usage of \\hypertarget \
and \\hyperlink: one argument instead of the same one twice. \
Also \\gmiflink and \\gmifref which typeset plain text instead of \
generating an error or printing '??' if there is no respective \
hypertarget or label."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-2023.209.0.0.97svn15878-54.2.noarch.rpm"
RPM_HASH = "872201364081ba96b3c85b00afe517b51bbbdf7045a13b49f73f1ae76fc00873938eab5f33a30780561451a6c7986c5c2d0c2f1a5f14f2b69546b1583f8aab94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmiflink.sty \
texlive-gmiflink"

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
