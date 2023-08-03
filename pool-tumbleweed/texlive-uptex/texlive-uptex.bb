SUMMARY = "Unicode version of pTeX"
DESCRIPTION = "upTeX is an extension of pTeX, using UTF-8 input and producing \
UTF-8 output. It was originally designed to improve support for \
Japanese, but is also useful for documents in Chinese and \
Korean. It can process Chinese simplified, Chinese traditional, \
Japanese, and Korean simultaneously, and can also process \
original LaTeX with \\inputenc{utf8} and Babel \
(Latin/Cyrillic/Greek etc.) by switching its \\kcatcode tables."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66381"

RPM_NAME = "texlive-uptex-2023.209.svn66381-54.1.noarch.rpm"
RPM_HASH = "56ffc05252f58060ae359332a17516621ac1e12edd30651d84db101b9c59a25d2a90ec6bd1a59cb25a21033ec75a0c5cad226090b093c8f72354117c97251594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-euptex.1 \
man-upbibtex.1 \
man-uppltotf.1 \
man-uptex.1 \
man-uptftopl.1 \
texlive-uptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-updmap.cfg \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plain \
texlive-ptex-base \
texlive-scripts \
texlive-scripts-bin \
texlive-uptex-base \
texlive-uptex-bin \
texlive-uptex-fonts"

inherit rpm
