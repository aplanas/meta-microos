SUMMARY = "US English hyphenation exceptions file"
DESCRIPTION = "Exceptions for American English hyphenation patterns are \
occasionally published in the TeX User Group journal TUGboat. \
This bundle provides alternative Perl and Bourne shell scripts \
to convert the source of such an article into an exceptions \
file, together with a recent copy of the article and \
machine-readable files."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57387"

RPM_NAME = "texlive-hyphenex-2023.209.svn57387-54.1.noarch.rpm"
RPM_HASH = "9ab9fc377ba920f66fb743e6c1fcdf04033369f273e68ce054c990bc00c7ded2ccdf0588b6b5fd6cd4ce7479db1aeb7ce1bd10aeef3119f42226c8c7bdc4a08c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ushyphex.tex \
texlive-hyphenex"

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
