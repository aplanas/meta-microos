SUMMARY = "Annotation symbols enclosed in square brackets and marked with an asterisk"
DESCRIPTION = "This LaTeX package can output annotation symbols enclosed in \
square brackets and marked with an asterisk."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63838"

RPM_NAME = "texlive-asternote-2023.209.1.1svn63838-54.1.noarch.rpm"
RPM_HASH = "264b9befa817114a807c324bf87bd7a64e82ce7f9c3685c2c3e8f01599613667c2ccee186d169f7c88366d9408b5c8490d537b46bfdecf5939dabdad8a06f517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asternote.sty \
texlive-asternote"

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
