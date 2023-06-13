SUMMARY = "Friulan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Friulan in ASCII encoding. They are \
supposed to comply with the common spelling of the Friulan \
(Furlan) language as fixed by the Regional Law N.15/96 dated \
November 6, 1996 and its following amendments."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-friulan-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "61944e35bbed6c222639a21f287640811c312eb218e4e508f7fa38c806269aab4635ecd26da2646dbe2f74e55739d19a159f01fa289d310e8c73758391959c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-fur.ec.tex) \
tex(hyph-fur.tex) \
tex(hyph-quote-fur.tex) \
tex(loadhyph-fur.tex) \
texlive-hyphen-friulan"

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
