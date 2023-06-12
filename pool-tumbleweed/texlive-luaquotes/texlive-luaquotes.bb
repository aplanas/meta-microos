SUMMARY = "Smart setting of quotation marks"
DESCRIPTION = "This package automatically generates quotation marks and \
punctuation depending on the selected language."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn65652"

RPM_NAME = "texlive-luaquotes-2023.201.1.4.0svn65652-52.1.noarch.rpm"
RPM_HASH = "fa02b1c67639c48a0ab9c6d5b64bbac06e058fcf7df9fb3de6dd84cb2306519db2875c7b173bbf3182cba11e387ce1b12ca6a1e7727232ee45b0da4a9ea9c8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luaquotes.sty) \
texlive-luaquotes"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(iftex.sty) \
tex(luacode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
