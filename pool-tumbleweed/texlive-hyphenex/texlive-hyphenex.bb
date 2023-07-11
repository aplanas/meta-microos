SUMMARY = "US English hyphenation exceptions file"
DESCRIPTION = "Exceptions for American English hyphenation patterns are \
occasionally published in the TeX User Group journal TUGboat. \
This bundle provides alternative Perl and Bourne shell scripts \
to convert the source of such an article into an exceptions \
file, together with a recent copy of the article and \
machine-readable files."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn57387"

RPM_NAME = "texlive-hyphenex-2023.208.svn57387-53.1.noarch.rpm"
RPM_HASH = "4b488cf71ce4bf4f9a4e9a0a0291eadc189bbae67849ffcfee59a847194f10ca7611d47086e494861157c01b10268edc3633f20a5fb93f12bc8fa3c5307be3fe"
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
