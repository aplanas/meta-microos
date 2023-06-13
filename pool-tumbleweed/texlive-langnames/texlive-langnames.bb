SUMMARY = "Name languages and their genetic affiliations consistently"
DESCRIPTION = "This package attempts to make the typing of language names, \
codes, and families slightly easier by providing macros to \
access pre-defined language--code--family combinations from two \
important databases, as well as the possibility to create new \
combinations. It may be particularly useful for large, \
collaborative projects as well as typologically minded ones \
with a variety of language examples."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn65502"

RPM_NAME = "texlive-langnames-2023.201.2.1svn65502-55.1.noarch.rpm"
RPM_HASH = "172ca378a5b81a13579e35e37692a78c055c14f689c99750350b94e192f9f2853b217870bc5c15daa1b7e02a4cc03c1e451a01d56b9f1a0fe2b999df6c306b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(langnames.sty) \
tex(ln_fams_glot.tex) \
tex(ln_fams_wals.tex) \
tex(ln_langs_glot.tex) \
tex(ln_langs_glot_native.tex) \
tex(ln_langs_wals.tex) \
tex(ln_langs_wals_native.tex) \
texlive-langnames"

RDEPENDS:${PN} += "/bin/sh \
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
