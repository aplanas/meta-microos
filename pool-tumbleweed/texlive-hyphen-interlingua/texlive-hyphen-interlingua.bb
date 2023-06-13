SUMMARY = "Interlingua hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Interlingua in ASCII encoding."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-interlingua-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "ee47800b0b871fca769550b997a4af4b1580ced76f2783ee4e8785c8e4dcc13c84cd83673034b3f54d4d232189a6e754fb8c6dd57cc989f9cd999ccc59643b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-ia.tex) \
tex(loadhyph-ia.tex) \
texlive-hyphen-interlingua"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
