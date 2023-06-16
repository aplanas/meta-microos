SUMMARY = "English Full Text styles for the datetime2 package"
DESCRIPTION = "English date and time styles that use words for the numbers and \
ordinals. This package provides the following date and time \
styles: 'en-fulltext', 'en-FullText', 'en-FULLTEXT', and the \
additional time style 'en-Fulltext'. (The date equivalent can \
be obtained through commands like \\Today.) Unlike the base \
styles provided by datetime2.sty, these styles aren't \
expandable styles. This means that you can't use the date or \
time in PDF bookmarks or in the argument of certain commands, \
such as \\MakeUppercase, while these styles are in use."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36705"

RPM_NAME = "texlive-datetime2-en-fulltext-2023.201.1.0svn36705-52.1.noarch.rpm"
RPM_HASH = "0c83d9b70cd73fb1fcd1ce1dc68d4fdcabc625de367b41ac69ebc6870ef606fa544179f461d68b2653f9ea3b3f17839249fe1935323eb1117df3e2924f68241e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-en-fulltext.sty \
texlive-datetime2-en-fulltext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime2.sty \
tex-fmtcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
