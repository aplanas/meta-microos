SUMMARY = "Extensions to the LaTeX NFSS"
DESCRIPTION = "The package is a development of nfssext.sty, distributed with \
the examples for the font installation guide. The package has \
been developed for use in packages such as cfr-lm and \
venturisadf,"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43640"

RPM_NAME = "texlive-nfssext-cfr-2023.201.svn43640-54.1.noarch.rpm"
RPM_HASH = "f916d694ac94d8f7fcb5c1d37ed719aa2167c6569455d28180d594b6442d45c9c3a4d0ea0ed386585180dac8e09e315165c5ea05bdbafd2c3b182cffe7c56fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nfssext-cfr.sty \
texlive-nfssext-cfr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
