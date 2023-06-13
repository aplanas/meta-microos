SUMMARY = "Unicode version of pTeX"
DESCRIPTION = "upTeX is an extension of pTeX, using UTF-8 input and producing \
UTF-8 output. It was originally designed to improve support for \
Japanese, but is also useful for documents in Chinese and \
Korean. It can process Chinese simplified, Chinese traditional, \
Japanese, and Korean simultaneously, and can also process \
original LaTeX with \\inputenc{utf8} and Babel \
(Latin/Cyrillic/Greek etc.) by switching its \\kcatcode tables."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66381"

RPM_NAME = "texlive-uptex-2023.201.svn66381-53.1.noarch.rpm"
RPM_HASH = "2804fec5a0d1218061abeea6ed75fb51bf7b81264923eb7768d01229501dcb31577a0dbf4348b7da79b87d1bea25e90713fc52ab9bd0e430560c1adf9f1cfe1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(euptex.1) \
man(upbibtex.1) \
man(uppltotf.1) \
man(uptex.1) \
man(uptftopl.1) \
texlive-uptex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
tex(updmap.cfg) \
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
