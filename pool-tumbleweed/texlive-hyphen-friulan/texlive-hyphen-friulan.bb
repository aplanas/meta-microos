SUMMARY = "Friulan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Friulan in ASCII encoding. They are \
supposed to comply with the common spelling of the Friulan \
(Furlan) language as fixed by the Regional Law N.15/96 dated \
November 6, 1996 and its following amendments."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-friulan-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "d93a272dc1832879510288bd7297b50a757650fa49b654f8a8c97ee92f9e3d4135429cfd1a4afea1ed77ee1f31d91c4fa4f1d0bef5948c7a6183047b6bf26f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fur.ec.tex \
tex-hyph-fur.tex \
tex-hyph-quote-fur.tex \
tex-loadhyph-fur.tex \
texlive-hyphen-friulan"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
