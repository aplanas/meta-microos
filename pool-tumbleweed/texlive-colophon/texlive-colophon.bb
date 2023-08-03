SUMMARY = "Provides commands for producing a colophon"
DESCRIPTION = "Colophons are a once-common design device by which a book (or \
document) designer gave some information to his readers about \
the design and makeup of the text. It typically includes the \
publisher (if not included elsewhere in the document), font \
size, leading size, measure, and of course font face \
identification. Sometimes it includes information about the \
tools used, as well. This package provides some highly \
configurable macros, with sensible defaults, for producing \
colophons without having to muck around with a lot of manual \
code."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47913"

RPM_NAME = "texlive-colophon-2023.209.1.1svn47913-54.1.noarch.rpm"
RPM_HASH = "b050ff421010e0a64f709d1d188da0e84d6c08bb3b925f022a293c2619c7a09133e757e249d589a8830d6d735c74dd6e6e9bc012c9c8d8908f03cdaf0c019170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colophon.sty \
texlive-colophon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
