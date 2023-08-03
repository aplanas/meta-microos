SUMMARY = "Consistent formatting of Bible references"
DESCRIPTION = "The package allows Bible references to be formatted in a \
consistent way. It is similar to the bibleref package, except \
that the formatting macros are all purely expandable -- that \
is, they are all implemented in TeX's mouth. This means that \
they can be used in any expandable context, such as an argument \
to a \\url command."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25527"

RPM_NAME = "texlive-bibleref-mouth-2023.209.1.0svn25527-54.1.noarch.rpm"
RPM_HASH = "0aba349a8571bb85a79329f6afbe557e1cdbdbb1e9d458c94d216b8f76a3e8f4b443e86f3ee005b98298720acdb66fbbe8a81e1b273aab91cf5c0b0fe699b7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-mouth.sty \
texlive-bibleref-mouth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fmtcount.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
