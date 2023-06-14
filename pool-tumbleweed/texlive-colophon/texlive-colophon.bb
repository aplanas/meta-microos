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

PV = "2023.201.1.1svn47913"

RPM_NAME = "texlive-colophon-2023.201.1.1svn47913-53.1.noarch.rpm"
RPM_HASH = "94e583773699454c443ecdfcad4e2535116c4c544ea22b59cd4e49a3471f646b0aef3a85af103e4f794a96ded5034acec2da8b16431868cb5084cd403f4568a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colophon.sty \
texlive-colophon"

RDEPENDS:${PN} += "/bin/sh \
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
