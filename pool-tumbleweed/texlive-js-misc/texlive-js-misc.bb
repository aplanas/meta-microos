SUMMARY = "Miscellaneous macros from Joachim Schrod"
DESCRIPTION = "A bunch of packages, including: idverb.tex, for 'short \
verbatim'; xfig.tex, for including xfig/transfig output in a \
TeX document; and cassette.tex for setting cassette labels."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16211"

RPM_NAME = "texlive-js-misc-2023.209.svn16211-56.1.noarch.rpm"
RPM_HASH = "0cfeb8a20c5ea4ab5d461e94bab13dfaa65857e55dba86e3eadbffc4f8627ae9ec209f70362bc317e9bf965133d3bd177143bb07482e4956509421362d20c244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cassette.tex \
tex-idverb.tex \
tex-js-misc.tex \
tex-schild.tex \
tex-sperr.tex \
tex-xfig.tex \
texlive-js-misc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
