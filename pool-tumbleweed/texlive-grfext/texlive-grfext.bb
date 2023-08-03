SUMMARY = "Manipulate the graphics package's list of extensions"
DESCRIPTION = "This package provides macros for adding to, and reordering the \
list of graphics file extensions recognised by package \
graphics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53024"

RPM_NAME = "texlive-grfext-2023.209.1.3svn53024-54.1.noarch.rpm"
RPM_HASH = "c9de4a14a6bb7f40b7cc63e01a44c9c49dd454464113cbf2bd32f63ae88fe70dd48a0e1ee6d6bf0c7a3735c213b781a7591636921812a21192445aab210505c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfext.sty \
texlive-grfext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-kvdefinekeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
