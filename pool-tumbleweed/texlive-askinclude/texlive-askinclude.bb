SUMMARY = "Interactive use of \\includeonly"
DESCRIPTION = "The package asks the user which files to put in a \\includeonly \
command. There is provision for answering 'same as last time' \
or 'all files'."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn54725"

RPM_NAME = "texlive-askinclude-2023.209.2.7svn54725-54.1.noarch.rpm"
RPM_HASH = "65b828fe4cc423278fb48018b53169d8aee55fef929207f247d2420da51748e24e452eb5b79454306ef6935741676d76e0b64a247d510f6f07575b4ce898bcf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-askinclude.sty \
texlive-askinclude"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvsetkeys.sty \
tex-makematch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
