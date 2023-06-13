SUMMARY = "Format written minutes of meetings"
DESCRIPTION = "The class allows formatting of meeting minutes using \\section \
commands (which provide hierarchical structure). An agenda can \
also be produced for distribution prior to the meeting, with \
user-selected portions suppressed from printing."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn31878"

RPM_NAME = "texlive-meetingmins-2023.201.1.6svn31878-52.1.noarch.rpm"
RPM_HASH = "b4246cadd381852eae32ea0815903c3168d74b216d80a83c9b2cbdb462c7a026be6121f12ca0202fd2b2b40402635d890229f81e21b19b5e6ef15bf0b02c6c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(meetingmins.cls) \
texlive-meetingmins"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(enumitem.sty) \
tex(environ.sty) \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(lmodern.sty) \
tex(mathabx.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
