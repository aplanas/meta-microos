SUMMARY = "US English hyphenation exceptions file"
DESCRIPTION = "Exceptions for American English hyphenation patterns are \
occasionally published in the TeX User Group journal TUGboat. \
This bundle provides alternative Perl and Bourne shell scripts \
to convert the source of such an article into an exceptions \
file, together with a recent copy of the article and \
machine-readable files."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57387"

RPM_NAME = "texlive-hyphenex-2023.201.svn57387-52.1.noarch.rpm"
RPM_HASH = "a1fad2bfb512033c16bf31beb47d1014fd0a9dceeb6c6f35ba9f59b076213d7a3b7c06b8c4d04bb2158bbd44e0796c0a10c1f04f0cf4b271c9096f6851b6ae24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ushyphex.tex \
texlive-hyphenex"

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
