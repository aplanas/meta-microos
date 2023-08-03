SUMMARY = "Simplify usage of \\hypertarget and \\hyperlink"
DESCRIPTION = "Three hyperref-based macros that simplify usage of \\hypertarget \
and \\hyperlink: one argument instead of the same one twice. \
Also \\gmiflink and \\gmifref which typeset plain text instead of \
generating an error or printing '??' if there is no respective \
hypertarget or label."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-2023.209.0.0.97svn15878-54.1.noarch.rpm"
RPM_HASH = "0c0ee0d08f91510b0d2f9e788e9f5b53dec6ba45cdf3cfce9691ec9efaadadda072a1b8347feb0b557e0365b7a6c9b8868c11326b030e0726a059a576de640f9"
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
