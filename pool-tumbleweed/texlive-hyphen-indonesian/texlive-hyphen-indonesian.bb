SUMMARY = "Indonesian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Indonesian (Bahasa Indonesia) in ASCII \
encoding. They are probably also usable for Malay (Bahasa \
Melayu)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-indonesian-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "d76334b5f0031d9a5ad23575e65946ddd2d2b8ba206fb766cf68774e46a05ebf65311b89187309574a83233e9875b8cc4220f180598a57b7a592ca5a90028974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-id.tex) \
tex(loadhyph-id.tex) \
texlive-hyphen-indonesian"
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
