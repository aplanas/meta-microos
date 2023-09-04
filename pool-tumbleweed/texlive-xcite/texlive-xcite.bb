SUMMARY = "Use citation keys from a different document"
DESCRIPTION = "The package xcite is no longer necessary, because its \
functionality has been taken over by xr, so this final version \
is just a stub that loads xr."
LICENSE = "LPPL-1.0"

PV = "2023.209.16383.99998svn53486"

RPM_NAME = "texlive-xcite-2023.209.16383.99998svn53486-53.2.noarch.rpm"
RPM_HASH = "81af8b6ec0f50b02a9dbd3f26de09653e6bc10940fddd13444317aa00272c713e08ce02c22e8e0f260f8823fa5937c4d3b4013adec6ad66941c49d5c73e38f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcite.sty \
texlive-xcite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
