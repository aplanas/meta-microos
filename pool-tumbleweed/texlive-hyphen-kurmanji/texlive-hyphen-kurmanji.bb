SUMMARY = "Kurmanji hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Kurmanji (Northern Kurdish) as spoken \
in Turkey and by the Kurdish diaspora in Europe, in T1/EC and \
UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-kurmanji-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "2f933456365eb995b30c9156b13bc76dd95b1fc88832beb58dd9911ff9acac193a4b57e10fc9c066f455f2bdce04898c0ed484364a48cabf259c0967da71d395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-kmr.ec.tex) \
tex(hyph-kmr.tex) \
tex(loadhyph-kmr.tex) \
texlive-hyphen-kurmanji"
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
