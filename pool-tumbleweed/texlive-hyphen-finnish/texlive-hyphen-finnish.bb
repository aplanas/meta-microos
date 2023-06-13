SUMMARY = "Finnish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Finnish in T1 and UTF-8 encodings. The \
older set, labelled just Ã¢ÂÂfiÃ¢ÂÂ, tries to implement \
etymological rules, while the newer ones (fi-x-school) \
implements the simpler rules taught at Finnish school."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-finnish-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "34426f4a88290028c5c9b5df3967dba4b7d121390a38312511c8558591e0b110c48f5082b9ed9903ae849b261457b86436e0c0b44b55d26dab7c19203e97888b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-fi-x-school.ec.tex) \
tex(hyph-fi-x-school.tex) \
tex(hyph-fi.ec.tex) \
tex(hyph-fi.tex) \
tex(loadhyph-fi-x-school.tex) \
tex(loadhyph-fi.tex) \
texlive-hyphen-finnish"

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
