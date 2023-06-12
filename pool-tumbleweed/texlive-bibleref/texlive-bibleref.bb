SUMMARY = "Format bible citations"
DESCRIPTION = "The bibleref package offers consistent formatting of references \
to parts of the Christian bible, in a number of well-defined \
formats. It depends on ifthen, fmtcount, and amsgen."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn55626"

RPM_NAME = "texlive-bibleref-2023.201.1.25svn55626-53.1.noarch.rpm"
RPM_HASH = "2b650003a0ba97efc7678b5e264fbf02a75f4dfa5e1be9924798012aa3d79e83e0a52334bfe49b474920c347d0c28b8e8975d742997ddd50ccc7c3490807982e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibleref-xidx.sty) \
tex(bibleref.sty) \
texlive-bibleref"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsgen.sty) \
tex(fmtcount.sty) \
tex(ifthen.sty) \
tex(ifxetex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
