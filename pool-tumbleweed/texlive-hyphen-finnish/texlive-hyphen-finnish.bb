SUMMARY = "Finnish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Finnish in T1 and UTF-8 encodings. The \
older set, labelled just Ã¢ÂÂfiÃ¢ÂÂ, tries to implement \
etymological rules, while the newer ones (fi-x-school) \
implements the simpler rules taught at Finnish school."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-finnish-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "ed062f70bf002a68a5f0077a9670d48b883de9cd78caf35c68b40cb9474d5981080f74c258ccac5c10c339f1bf2cd5448471b653bf30e8ecf22c0a88d70cfbc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fi-x-school.ec.tex \
tex-hyph-fi-x-school.tex \
tex-hyph-fi.ec.tex \
tex-hyph-fi.tex \
tex-loadhyph-fi-x-school.tex \
tex-loadhyph-fi.tex \
texlive-hyphen-finnish"

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
