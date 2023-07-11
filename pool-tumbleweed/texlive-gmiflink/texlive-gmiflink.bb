SUMMARY = "Simplify usage of \\hypertarget and \\hyperlink"
DESCRIPTION = "Three hyperref-based macros that simplify usage of \\hypertarget \
and \\hyperlink: one argument instead of the same one twice. \
Also \\gmiflink and \\gmifref which typeset plain text instead of \
generating an error or printing '??' if there is no respective \
hypertarget or label."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-2023.201.0.0.97svn15878-53.2.noarch.rpm"
RPM_HASH = "5e9bcb44ceb2dec6d9e34e55a51728c84d74d31a28e9f605e92b7f76f9e67a47151e3e4177b0d2f75ef0e32f90549218b73b1b38e40a0a6d89334af572638bc9"
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
